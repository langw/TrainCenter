package com.huami.watch.train.ui.test;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import com.huami.watch.train.R;
import com.huami.watch.train.base.BaseActivity;
import com.huami.watch.train.ui.notification.NotificationService;
import com.huami.watch.train.utils.LogUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jinliang on 16/11/25.
 *
 *  测试Provider
 */

public class TestProvider extends BaseActivity {
    private static final String TAG = TestProvider.class.getSimpleName();
    private NotificationManager notificationManager ;
    private NotificationCompat.Builder builder ;

    private Long id ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        Long todayTrainRecordId = 400l ;
//        updateTodayTaskStatus(todayTrainRecordId);
        LogUtils.print(TAG, "onCreate");

//startNotificationService();

        queryTodayTask();
//        testAutoFinishExpiredData();

    }


    /**
     * 测试自动完成过期数据
     */
    private void testAutoFinishExpiredData(){

        ContentResolver resolver =  getContentResolver();
        Uri uri = Uri.parse("content://com.huami.watch.train.ui.provider.dayTrainRecordProvider/autoDealExpiredData");
        int result =  resolver.update(uri,null,null,null);
        LogUtils.print(TAG, "testAutoFinishExpiredData  result:"+ result);


    }
    private void startNotificationService(){

        String packageName = "com.huami.watch.train.ui.notification";//需要开启服务的app包名
        String serviceClassName = packageName + "NotificationService";
        Intent serviceIntent = new Intent(this,NotificationService.class);

//        serviceIntent.setComponent(new ComponentName(packageName, serviceClassName));
         startService(serviceIntent);//启动服务

    }

    @OnClick(R.id.sendNotification)
    public void testSendNofication (){
        LogUtils.print(TAG, "testSendNofication");

//       startNotificationService();

        LogUtils.print(TAG, "testSendNofication id:"+ id);
        updateTodayTaskStatus(id);
    }

    /**
     * 当天任务只对当天有效
     */
    private void queryTodayTask(){
        ContentResolver resolver =  getContentResolver();
        Uri uri = Uri.parse("content://com.huami.watch.train.ui.provider.dayTrainRecordProvider/getTodayTrainTask");
        // 添加运动类型
        Cursor cursor = resolver.query(uri,null,null,null,null);
        double  distance  ;
        int rateStart,rateEnd,dayTrainStatus,item ;
        /**
         * _id , DISTANCE ,RATE_START,RATE_END,DAY_TRAIN_STATUS
         */
        if(cursor!=null){
            Bundle  bundle  =  cursor.getExtras();
            // sportType: 100 running  ，200  swiming ，300 ride  400： rest；

            LogUtils.print(TAG, "testQuery  cursor has data ");
            while (cursor.moveToNext()) {
                item = 0 ;
                id  = cursor.getLong(item++);
                distance = cursor.getDouble(item++);
                rateStart = cursor.getInt(item++);
                rateEnd =cursor.getInt(item++);
                dayTrainStatus = cursor.getInt(item++);
                int sportType =cursor.getInt(item++);
                LogUtils.sysPrint(TAG," id:"+id+",distance:"+distance+",rateStart:"
                        +rateStart+",rateEnd:"+rateEnd+",dayTrainStatus:"+dayTrainStatus
                        +",sportType:"+ sportType
                );
            }
        }else {
            LogUtils.print(TAG, "testQuery  cursor has no data ");
        }

        LogUtils.print(TAG, "queryTodayTask  id:"+ id);

    }

    /**
     * 更新当天的任务状态
     * @param todayTaskId
     */
    private void updateTodayTaskStatus(Long todayTaskId){

        ContentResolver resolver =  getContentResolver();
        Uri uri = Uri.parse("content://com.huami.watch.train.ui.provider.dayTrainRecordProvider/finishTodayTrainTask");

        Uri resultUri = ContentUris.withAppendedId(uri, todayTaskId);

        LogUtils.print(TAG, "resultUri:"+ resultUri.toString());

        // 当resultInt = 1 时候, 404 代表传值失败  其他操作失败
        int resultInt = resolver.update(resultUri,null,null,null);
        LogUtils.print(TAG, "resultInt:"+ resultInt);


    }

    private void initAlarmClock(){
//            //设置当前时间
//            Calendar c = Calendar.getInstance();
//            c.setTimeInMillis(System.currentTimeMillis());
//            // 根据用户选择的时间来设置Calendar对象
//            c.set(Calendar.HOUR, hourOfDay);
//            c.set(Calendar.MINUTE, minute);
//            // ②设置AlarmManager在Calendar对应的时间启动Activity
//            alarmManager.set(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), pi);


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}

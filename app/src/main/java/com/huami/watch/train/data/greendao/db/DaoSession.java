package com.huami.watch.train.data.greendao.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig trainRecordDaoConfig;
    private final DaoConfig dayTrainRecordDaoConfig;

    private final TrainRecordDao trainRecordDao;
    private final DayTrainRecordDao dayTrainRecordDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        trainRecordDaoConfig = daoConfigMap.get(TrainRecordDao.class).clone();
        trainRecordDaoConfig.initIdentityScope(type);

        dayTrainRecordDaoConfig = daoConfigMap.get(DayTrainRecordDao.class).clone();
        dayTrainRecordDaoConfig.initIdentityScope(type);

        trainRecordDao = new TrainRecordDao(trainRecordDaoConfig, this);
        dayTrainRecordDao = new DayTrainRecordDao(dayTrainRecordDaoConfig, this);

        registerDao(TrainRecord.class, trainRecordDao);
        registerDao(DayTrainRecord.class, dayTrainRecordDao);
    }
    
    public void clear() {
        trainRecordDaoConfig.getIdentityScope().clear();
        dayTrainRecordDaoConfig.getIdentityScope().clear();
    }

    public TrainRecordDao getTrainRecordDao() {
        return trainRecordDao;
    }

    public DayTrainRecordDao getDayTrainRecordDao() {
        return dayTrainRecordDao;
    }

}

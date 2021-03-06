package com.huami.watch.train.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.huami.watch.train.model.TrainRecord;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table TrainRecord.
*/
public class TrainRecordDao extends AbstractDao<TrainRecord, Long> {

    public static final String TABLENAME = "TrainRecord";

    /**
     * Properties of entity TrainRecord.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TrainPlanId = new Property(1, Integer.class, "trainPlanId", false, "TRAIN_PLAN_ID");
        public final static Property TrainType = new Property(2, Integer.class, "trainType", false, "TRAIN_TYPE");
        public final static Property TrainTitle = new Property(3, String.class, "trainTitle", false, "TRAIN_TITLE");
        public final static Property TrainStatus = new Property(4, Integer.class, "trainStatus", false, "TRAIN_STATUS");
        public final static Property StartData = new Property(5, java.util.Date.class, "startData", false, "START_DATA");
        public final static Property EndData = new Property(6, java.util.Date.class, "endData", false, "END_DATA");
        public final static Property TrainDays = new Property(7, Integer.class, "trainDays", false, "TRAIN_DAYS");
        public final static Property TotalDays = new Property(8, Integer.class, "totalDays", false, "TOTAL_DAYS");
        public final static Property TrainTotalLength = new Property(9, Double.class, "trainTotalLength", false, "TRAIN_TOTAL_LENGTH");
        public final static Property TotalLength = new Property(10, Double.class, "totalLength", false, "TOTAL_LENGTH");
        public final static Property LastTrainOffsetDays = new Property(11, Integer.class, "lastTrainOffsetDays", false, "LAST_TRAIN_OFFSET_DAYS");
    };


    public TrainRecordDao(DaoConfig config) {
        super(config);
    }
    
    public TrainRecordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'TrainRecord' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'TRAIN_PLAN_ID' INTEGER," + // 1: trainPlanId
                "'TRAIN_TYPE' INTEGER," + // 2: trainType
                "'TRAIN_TITLE' TEXT," + // 3: trainTitle
                "'TRAIN_STATUS' INTEGER," + // 4: trainStatus
                "'START_DATA' INTEGER," + // 5: startData
                "'END_DATA' INTEGER," + // 6: endData
                "'TRAIN_DAYS' INTEGER," + // 7: trainDays
                "'TOTAL_DAYS' INTEGER," + // 8: totalDays
                "'TRAIN_TOTAL_LENGTH' REAL," + // 9: trainTotalLength
                "'TOTAL_LENGTH' REAL," + // 10: totalLength
                "'LAST_TRAIN_OFFSET_DAYS' INTEGER);"); // 11: lastTrainOffsetDays
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'TrainRecord'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TrainRecord entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer trainPlanId = entity.getTrainPlanId();
        if (trainPlanId != null) {
            stmt.bindLong(2, trainPlanId);
        }
 
        Integer trainType = entity.getTrainType();
        if (trainType != null) {
            stmt.bindLong(3, trainType);
        }
 
        String trainTitle = entity.getTrainTitle();
        if (trainTitle != null) {
            stmt.bindString(4, trainTitle);
        }
 
        Integer trainStatus = entity.getTrainStatus();
        if (trainStatus != null) {
            stmt.bindLong(5, trainStatus);
        }
 
        java.util.Date startData = entity.getStartData();
        if (startData != null) {
            stmt.bindLong(6, startData.getTime());
        }
 
        java.util.Date endData = entity.getEndData();
        if (endData != null) {
            stmt.bindLong(7, endData.getTime());
        }
 
        Integer trainDays = entity.getTrainDays();
        if (trainDays != null) {
            stmt.bindLong(8, trainDays);
        }
 
        Integer totalDays = entity.getTotalDays();
        if (totalDays != null) {
            stmt.bindLong(9, totalDays);
        }
 
        Double trainTotalLength = entity.getTrainTotalLength();
        if (trainTotalLength != null) {
            stmt.bindDouble(10, trainTotalLength);
        }
 
        Double totalLength = entity.getTotalLength();
        if (totalLength != null) {
            stmt.bindDouble(11, totalLength);
        }
 
        Integer lastTrainOffsetDays = entity.getLastTrainOffsetDays();
        if (lastTrainOffsetDays != null) {
            stmt.bindLong(12, lastTrainOffsetDays);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TrainRecord readEntity(Cursor cursor, int offset) {
        TrainRecord entity = new TrainRecord( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // trainPlanId
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // trainType
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // trainTitle
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // trainStatus
            cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)), // startData
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)), // endData
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // trainDays
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // totalDays
            cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9), // trainTotalLength
            cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10), // totalLength
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // lastTrainOffsetDays
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TrainRecord entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTrainPlanId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTrainType(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setTrainTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTrainStatus(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setStartData(cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)));
        entity.setEndData(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
        entity.setTrainDays(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setTotalDays(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setTrainTotalLength(cursor.isNull(offset + 9) ? null : cursor.getDouble(offset + 9));
        entity.setTotalLength(cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10));
        entity.setLastTrainOffsetDays(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TrainRecord entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TrainRecord entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}

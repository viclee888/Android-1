package connect.db.green.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MESSAGE_ENTITY".
*/
public class MessageEntityDao extends AbstractDao<MessageEntity, Long> {

    public static final String TABLENAME = "MESSAGE_ENTITY";

    /**
     * Properties of entity MessageEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_ID");
        public final static Property Message_ower = new Property(1, String.class, "message_ower", false, "MESSAGE_OWER");
        public final static Property Message_id = new Property(2, String.class, "message_id", false, "MESSAGE_ID");
        public final static Property Content = new Property(3, String.class, "content", false, "CONTENT");
        public final static Property Read_time = new Property(4, Long.class, "read_time", false, "READ_TIME");
        public final static Property State = new Property(5, Integer.class, "state", false, "STATE");
        public final static Property Send_status = new Property(6, Integer.class, "send_status", false, "SEND_STATUS");
        public final static Property Snap_time = new Property(7, Long.class, "snap_time", false, "SNAP_TIME");
        public final static Property Createtime = new Property(8, Long.class, "createtime", false, "CREATETIME");
    }


    public MessageEntityDao(DaoConfig config) {
        super(config);
    }
    
    public MessageEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MESSAGE_ENTITY\" (" + //
                "\"_ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: _id
                "\"MESSAGE_OWER\" TEXT NOT NULL ," + // 1: message_ower
                "\"MESSAGE_ID\" TEXT NOT NULL UNIQUE ," + // 2: message_id
                "\"CONTENT\" TEXT," + // 3: content
                "\"READ_TIME\" INTEGER," + // 4: read_time
                "\"STATE\" INTEGER," + // 5: state
                "\"SEND_STATUS\" INTEGER," + // 6: send_status
                "\"SNAP_TIME\" INTEGER," + // 7: snap_time
                "\"CREATETIME\" INTEGER);"); // 8: createtime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MESSAGE_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MessageEntity entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
        stmt.bindString(2, entity.getMessage_ower());
        stmt.bindString(3, entity.getMessage_id());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
 
        Long read_time = entity.getRead_time();
        if (read_time != null) {
            stmt.bindLong(5, read_time);
        }
 
        Integer state = entity.getState();
        if (state != null) {
            stmt.bindLong(6, state);
        }
 
        Integer send_status = entity.getSend_status();
        if (send_status != null) {
            stmt.bindLong(7, send_status);
        }
 
        Long snap_time = entity.getSnap_time();
        if (snap_time != null) {
            stmt.bindLong(8, snap_time);
        }
 
        Long createtime = entity.getCreatetime();
        if (createtime != null) {
            stmt.bindLong(9, createtime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MessageEntity entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
        stmt.bindString(2, entity.getMessage_ower());
        stmt.bindString(3, entity.getMessage_id());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
 
        Long read_time = entity.getRead_time();
        if (read_time != null) {
            stmt.bindLong(5, read_time);
        }
 
        Integer state = entity.getState();
        if (state != null) {
            stmt.bindLong(6, state);
        }
 
        Integer send_status = entity.getSend_status();
        if (send_status != null) {
            stmt.bindLong(7, send_status);
        }
 
        Long snap_time = entity.getSnap_time();
        if (snap_time != null) {
            stmt.bindLong(8, snap_time);
        }
 
        Long createtime = entity.getCreatetime();
        if (createtime != null) {
            stmt.bindLong(9, createtime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MessageEntity readEntity(Cursor cursor, int offset) {
        MessageEntity entity = new MessageEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.getString(offset + 1), // message_ower
            cursor.getString(offset + 2), // message_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // content
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // read_time
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // state
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // send_status
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // snap_time
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8) // createtime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MessageEntity entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMessage_ower(cursor.getString(offset + 1));
        entity.setMessage_id(cursor.getString(offset + 2));
        entity.setContent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRead_time(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setState(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setSend_status(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setSnap_time(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setCreatetime(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MessageEntity entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MessageEntity entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MessageEntity entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
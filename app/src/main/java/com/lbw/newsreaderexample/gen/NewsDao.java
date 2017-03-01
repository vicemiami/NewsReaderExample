package com.lbw.newsreaderexample.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lbw.newsreaderexample.bean.News;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NEWS".
*/
public class NewsDao extends AbstractDao<News, Long> {

    public static final String TABLENAME = "NEWS";

    /**
     * Properties of entity News.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_id");
        public final static Property Imgurl = new Property(1, String.class, "imgurl", false, "IMGURL");
        public final static Property Has_content = new Property(2, String.class, "has_content", false, "HAS_CONTENT");
        public final static Property Docurl = new Property(3, String.class, "docurl", false, "DOCURL");
        public final static Property Time = new Property(4, String.class, "time", false, "TIME");
        public final static Property Title = new Property(5, String.class, "title", false, "TITLE");
        public final static Property Channelname = new Property(6, String.class, "channelname", false, "CHANNELNAME");
        public final static Property Id = new Property(7, int.class, "id", false, "ID");
    }


    public NewsDao(DaoConfig config) {
        super(config);
    }
    
    public NewsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NEWS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: _id
                "\"IMGURL\" TEXT," + // 1: imgurl
                "\"HAS_CONTENT\" TEXT," + // 2: has_content
                "\"DOCURL\" TEXT," + // 3: docurl
                "\"TIME\" TEXT," + // 4: time
                "\"TITLE\" TEXT," + // 5: title
                "\"CHANNELNAME\" TEXT," + // 6: channelname
                "\"ID\" INTEGER NOT NULL );"); // 7: id
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NEWS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, News entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String imgurl = entity.getImgurl();
        if (imgurl != null) {
            stmt.bindString(2, imgurl);
        }
 
        String has_content = entity.getHas_content();
        if (has_content != null) {
            stmt.bindString(3, has_content);
        }
 
        String docurl = entity.getDocurl();
        if (docurl != null) {
            stmt.bindString(4, docurl);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(5, time);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(6, title);
        }
 
        String channelname = entity.getChannelname();
        if (channelname != null) {
            stmt.bindString(7, channelname);
        }
        stmt.bindLong(8, entity.getId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, News entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String imgurl = entity.getImgurl();
        if (imgurl != null) {
            stmt.bindString(2, imgurl);
        }
 
        String has_content = entity.getHas_content();
        if (has_content != null) {
            stmt.bindString(3, has_content);
        }
 
        String docurl = entity.getDocurl();
        if (docurl != null) {
            stmt.bindString(4, docurl);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(5, time);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(6, title);
        }
 
        String channelname = entity.getChannelname();
        if (channelname != null) {
            stmt.bindString(7, channelname);
        }
        stmt.bindLong(8, entity.getId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public News readEntity(Cursor cursor, int offset) {
        News entity = new News( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // imgurl
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // has_content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // docurl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // time
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // title
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // channelname
            cursor.getInt(offset + 7) // id
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, News entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setImgurl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setHas_content(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDocurl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTitle(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setChannelname(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setId(cursor.getInt(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(News entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(News entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(News entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
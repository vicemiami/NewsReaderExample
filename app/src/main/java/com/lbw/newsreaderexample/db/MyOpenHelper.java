package com.lbw.newsreaderexample.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


import com.lbw.newsreaderexample.gen.DaoMaster;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Administrator on 2016/10/31.
 */
public class MyOpenHelper extends DaoMaster.OpenHelper {

    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        //super.onUpgrade(db, oldVersion, newVersion);

    }
}

package com.lbw.newsreaderexample.db;


import com.lbw.newsreaderexample.MyApplication;
import com.lbw.newsreaderexample.gen.DaoMaster;
import com.lbw.newsreaderexample.gen.DaoSession;

/**
 * Created by hasee on 2016-08-29.
 */
public class GreenDaoManager {
    private static GreenDaoManager mInstance;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;


    public GreenDaoManager() {
        MyOpenHelper openHelper = new MyOpenHelper(MyApplication.getContextObject(),"newsreader-db",null);
        DaoMaster mDaoMaster = new DaoMaster(openHelper.getWritableDatabase());
//        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(MyApplication.getContextObject(), "evisitor-db", null);
//        mDaoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        mDaoSession = mDaoMaster.newSession();
    }

    public static GreenDaoManager getInstance() {
        if (mInstance == null) {
            mInstance = new GreenDaoManager();
        }
        return mInstance;
    }

    public DaoMaster getMaster() {
        return mDaoMaster;
    }

    public DaoSession getSession() {
        return mDaoSession;
    }

    public DaoSession getNewSession() {
        mDaoSession = mDaoMaster.newSession();
        return mDaoSession;
    }
}

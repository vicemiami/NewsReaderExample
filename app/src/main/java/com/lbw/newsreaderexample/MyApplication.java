package com.lbw.newsreaderexample;

import android.app.Application;
import android.content.Context;


/**
 * Created by hasee on 2017-02-11.
 */
public class MyApplication extends Application {
    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContextObject() {
        return context;
    }


}

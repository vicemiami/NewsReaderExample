package com.lbw.newsreaderexample.config.retrofit;



import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.lbw.newsreaderexample.config.retrofit.converter.NewsConverterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Administrator on 2016/12/23.
 */
public class RetrofitWrapper {
    private static RetrofitWrapper instance;
    private Retrofit mRetrofit;

    private RetrofitWrapper() {

        //初始化 添加转换工厂
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(NewsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    public static RetrofitWrapper getInstance() {

        if(instance == null) {
            synchronized(RetrofitWrapper.class) {
                if(instance == null) {
                    instance = new RetrofitWrapper();
                }
            }
        }

        return instance;
    }

    /**
     * 转换为对象的Service
     * @param service
     * @param <T>
     * @return
     */
    public <T> T create(Class<T> service){
        return mRetrofit.create(service);
    }

    /**
     * 常量类 基本的URL
     */
    public class Constant {
        //BASE_URL 可以自行替换
        public static final String BASE_URL = "http://wangyi.butterfly.mopaasapp.com/";
    }
}

package com.lbw.newsreaderexample.config.retrofit.service;

import com.lbw.newsreaderexample.bean.News;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hasee on 2017-03-01.
 */
public interface NewsUrlService {
    @GET("news/api")
    Observable<ArrayList<News>> getNewsJsonString(@Query("type") String type, @Query("page") String page, @Query("limit") String limit);
}

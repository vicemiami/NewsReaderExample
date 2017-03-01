package com.lbw.newsreaderexample.main.news.model;

import com.lbw.newsreaderexample.bean.News;
import com.lbw.newsreaderexample.listener.NewsListener;

import java.util.List;

/**
 * Created by hasee on 2017-03-01.
 */
public interface NewsModel {
    void downloadNewsByKey(String key, NewsListener listener);

    List<News> getOfflineData();

    void deleteAllOfflineData();

    void insertOfflineData(List<News> list);
}

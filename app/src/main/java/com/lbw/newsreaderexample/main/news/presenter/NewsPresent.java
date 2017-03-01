package com.lbw.newsreaderexample.main.news.presenter;

import com.lbw.newsreaderexample.bean.News;

import java.util.List;

/**
 * Created by hasee on 2017-03-01.
 */
public interface NewsPresent {
    void downloadNews(String key);

    void getOfflineNews();

    void deleteAllOfflineData();

    void insertOfflineData(List<News> list);
}

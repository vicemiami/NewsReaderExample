package com.lbw.newsreaderexample.main.news.presenter;

import com.lbw.newsreaderexample.bean.News;
import com.lbw.newsreaderexample.listener.NewsListener;
import com.lbw.newsreaderexample.main.news.model.NewsModel;
import com.lbw.newsreaderexample.main.news.model.NewsModelImpl;
import com.lbw.newsreaderexample.main.news.view.NewsView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017-03-01.
 */
public class NewsPresentImpl implements NewsPresent,NewsListener {
    NewsView newsView;
    NewsModel newsModel;

    public NewsPresentImpl(NewsView newsView) {
        this.newsView = newsView;
        newsModel = new NewsModelImpl();
    }

    @Override
    public void downloadNews(String key) {
        newsModel.downloadNewsByKey(key,this);
    }

    @Override
    public void getOfflineNews() {
        newsView.initOfflineData(newsModel.getOfflineData());
    }

    @Override
    public void deleteAllOfflineData() {
        newsModel.deleteAllOfflineData();
    }

    @Override
    public void insertOfflineData(List<News> list) {
        newsModel.insertOfflineData(list);
    }

    @Override
    public void onDownloadSuccess(ArrayList<News> list) {
        newsView.initNewsData(list);
    }

    @Override
    public void onDownloadFail(String msg) {
        newsView.toastFailString("网络异常，将展示离线缓存内容");
    }
}

package com.lbw.newsreaderexample.main.news.view;

import com.lbw.newsreaderexample.bean.News;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017-03-01.
 */
public interface NewsView {
    void initNewsData(ArrayList<News> list);

    void initOfflineData(List<News> list);

    void toastFailString(String msg);
}

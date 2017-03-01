package com.lbw.newsreaderexample.listener;

import com.lbw.newsreaderexample.bean.News;

import java.util.ArrayList;

/**
 * Created by hasee on 2017-03-01.
 */
public interface NewsListener {
    void onDownloadSuccess(ArrayList<News> list);
    void onDownloadFail(String msg);
}

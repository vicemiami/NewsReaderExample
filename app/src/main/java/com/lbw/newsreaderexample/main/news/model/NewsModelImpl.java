package com.lbw.newsreaderexample.main.news.model;

import com.lbw.newsreaderexample.bean.News;
import com.lbw.newsreaderexample.config.retrofit.service.NewsUrlService;
import com.lbw.newsreaderexample.config.retrofit.RetrofitWrapper;
import com.lbw.newsreaderexample.db.GreenDaoManager;
import com.lbw.newsreaderexample.gen.NewsDao;
import com.lbw.newsreaderexample.listener.NewsListener;

import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.rx.RxQuery;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by hasee on 2017-03-01.
 */
public class NewsModelImpl implements NewsModel {
    @Override
    public void downloadNewsByKey(String key, final NewsListener listener) {
        NewsUrlService service = RetrofitWrapper.getInstance().create(NewsUrlService.class);
        service.getNewsJsonString(key, "1", "20")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ArrayList<News>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ArrayList<News> value) {
                        listener.onDownloadSuccess(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        listener.onDownloadFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public List<News> getOfflineData() {
        NewsDao dao = GreenDaoManager.getInstance().getSession().getNewsDao();
        QueryBuilder<News> qb = dao.queryBuilder();
        return qb.list();
    }

    @Override
    public void deleteAllOfflineData() {
        NewsDao dao = GreenDaoManager.getInstance().getSession().getNewsDao();
        dao.deleteAll();
    }

    @Override
    public void insertOfflineData(List<News> list) {
        NewsDao dao = GreenDaoManager.getInstance().getSession().getNewsDao();
        dao.insertInTx(list);
    }
}

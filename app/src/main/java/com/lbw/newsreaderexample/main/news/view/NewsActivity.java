package com.lbw.newsreaderexample.main.news.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.lbw.newsreaderexample.R;
import com.lbw.newsreaderexample.adapter.NewsAdapter;
import com.lbw.newsreaderexample.bean.News;
import com.lbw.newsreaderexample.db.GreenDaoManager;
import com.lbw.newsreaderexample.main.news.presenter.NewsPresent;
import com.lbw.newsreaderexample.main.news.presenter.NewsPresentImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewsActivity extends AppCompatActivity implements NewsView {


    NewsPresent newsPresent;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        newsPresent = new NewsPresentImpl(this);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewsAdapter(getApplicationContext(), new ArrayList<News>());
        recyclerView.setAdapter(adapter);
        newsPresent.downloadNews("war");
    }

    @Override
    public void initNewsData(ArrayList<News> list) {
        newsPresent.deleteAllOfflineData();
        adapter.initData(list);
        newsPresent.insertOfflineData(list);
    }

    @Override
    public void initOfflineData(List<News> list) {
        if (list != null && list.size() > 0) {
            adapter.initData(list);
        }
    }



    @Override
    public void toastFailString(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
        newsPresent.getOfflineNews();
    }
}

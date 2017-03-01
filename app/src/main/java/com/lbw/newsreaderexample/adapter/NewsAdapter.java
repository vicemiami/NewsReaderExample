package com.lbw.newsreaderexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.lbw.newsreaderexample.R;
import com.lbw.newsreaderexample.bean.News;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by hasee on 2017-03-01.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    Context context;
    List<News> list;
    AdapterView.OnItemClickListener onItemClickListener;


    public NewsAdapter(Context context, List<News> list) {
        this.context = context;
        this.list = list;
    }

    public void initData(List<News> list) {
        this.list.clear();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, null);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.textView.setText(list.get(position).getTitle());
        Picasso.with(context).load(list.get(position).getImgurl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


        class NewsViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.textView)
        TextView textView;

        public NewsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

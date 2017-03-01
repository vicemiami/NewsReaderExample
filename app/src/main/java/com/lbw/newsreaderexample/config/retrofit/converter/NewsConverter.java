package com.lbw.newsreaderexample.config.retrofit.converter;

import com.google.gson.Gson;
import com.lbw.newsreaderexample.bean.News;
import com.lbw.newsreaderexample.bean.NewsJsonString;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by hasee on 2017-03-01.
 */
public  class NewsConverter  implements Converter<ResponseBody, ArrayList<News>> {

    public static final NewsConverter INSTANCE = new NewsConverter();


    @Override
    public ArrayList<News> convert(ResponseBody value) throws IOException {
        String jsonString = value.string();
        Gson gson = new Gson();
        NewsJsonString newsJsonString = gson.fromJson(jsonString,NewsJsonString.class);
        return newsJsonString.getList();
    }
}

package com.lbw.newsreaderexample.config.retrofit.converter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * Created by hasee on 2017-03-01.
 */
public class NewsConverterFactory extends Converter.Factory {
    public static final NewsConverterFactory INSTANCE = new NewsConverterFactory();

    public static NewsConverterFactory create() {
        return INSTANCE;
    }
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return NewsConverter.INSTANCE;
    }
}

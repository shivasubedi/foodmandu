package com.classpractice.foodmandu.Api;
import com.classpractice.foodmandu.Url.Url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitC {

    public static Retrofit  getInstance() {
        Retrofit retrofitC = new Retrofit.Builder()
                .baseUrl(Url.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofitC;
    }
}

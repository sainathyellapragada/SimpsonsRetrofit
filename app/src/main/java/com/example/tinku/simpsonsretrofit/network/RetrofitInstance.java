package com.example.tinku.simpsonsretrofit.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ryellap on 2/23/18.
 */

public class RetrofitInstance {

    private static final String BASE_URL = "http://api.duckduckgo.com/";

    static Retrofit retrofit = null;

// This is Bulder pattern
    public static Retrofit getRetrofitInstance() {
        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory
                        .create())
                .build();
        return retrofit;
    }
}

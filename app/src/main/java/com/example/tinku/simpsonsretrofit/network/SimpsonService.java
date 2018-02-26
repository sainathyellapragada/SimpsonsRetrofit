package com.example.tinku.simpsonsretrofit.network;

import com.example.tinku.simpsonsretrofit.model.SimpsonResponse;
import com.example.tinku.simpsonsretrofit.pojos.RelatedTopicsItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ryellap on 2/23/18.
 */

public interface SimpsonService {

    // /http://api.duckduckgo.com/?q=simpsons+characters&format=json

    @GET(".")
    Call<SimpsonResponse> getSimpsonDetails(@Query(value = "q",encoded = true) String s, @Query("format") String s2);

}

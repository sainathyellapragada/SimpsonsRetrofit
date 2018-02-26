package com.example.tinku.simpsonsretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.tinku.simpsonsretrofit.model.SimpsonResponse;
import com.example.tinku.simpsonsretrofit.network.RetrofitInstance;
import com.example.tinku.simpsonsretrofit.network.SimpsonService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    //http://api.duckduckgo.com/?q=simpsons+characters&format=json

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpsonService service = RetrofitInstance.getRetrofitInstance().create(SimpsonService.class);

        Call<SimpsonResponse> call = service.getSimpsonDetails("simpsons+characters","json");

        call.enqueue(new Callback<SimpsonResponse>() {
            @Override
            public void onResponse(Call<SimpsonResponse> call, Response<SimpsonResponse> response) {

                Log.e("res", response.raw().toString());

            }

            @Override
            public void onFailure(Call<SimpsonResponse> call, Throwable t) {
                Log.e("fail ", "" + t.getMessage());
            }
        });
    }
}

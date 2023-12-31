package com.example.retrofitcuartos.retrofit;

import com.example.retrofitcuartos.request.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL ="http://54.161.51.54/api/";
    private static Retrofit retrofit = null;
    public  static Retrofit getRetrofitClient()
    {
        if(retrofit ==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

package com.example.retrofitcuartos.request;

import com.example.retrofitcuartos.models.Cuartos;
import com.example.retrofitcuartos.models.Sensores;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("/api/auth/recibir-datos")
    Call<List<Cuartos>> getCuartos();

}

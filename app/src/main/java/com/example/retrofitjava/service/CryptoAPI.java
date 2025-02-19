package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //URL BASE -> www.xxxxxxx.com bu kısım ana url kısmı olarak geçer
    //get içerisine dat comdan sonraki kısmı eklememiz gerekiyor


    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json



    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();

}

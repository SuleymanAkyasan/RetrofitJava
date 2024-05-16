package com.example.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    //serialized name içerisindekiler gelen datanın adını döndüreceğinden aynı olmak zorundadırlar.Stringler olmasına gerek yok

    @SerializedName("currency")
    public String currency;

    @SerializedName("price")
    public String price;

}

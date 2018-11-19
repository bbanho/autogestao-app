package com.example.bruno.teste;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConnector {

    private User user = null;

    // 0 - login
    // 1 - registrar


    public Retrofit RetrofitConnector(User user) {

        // Configura conector

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        return new Retrofit.Builder()
                .baseUrl("http://ec2-18-231-123-92.sa-east-1.compute.amazonaws.com:3000/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

    }
}

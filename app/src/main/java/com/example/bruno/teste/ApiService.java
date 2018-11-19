package com.example.bruno.teste;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    @GET("users/{id}")
    Call<User> getUser(@Path("id") Integer id, String token);

    @POST("users/login")
    Call<User> login(@Body User user);

    @POST("users/logout")
    Call<User> logout(@Body String email, String token);

    @POST("users")
    Call<User> register(@Body String email, String pwd, String name, String nroUsp);

}

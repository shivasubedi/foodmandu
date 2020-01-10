package com.classpractice.foodmandu.Api;

import com.classpractice.foodmandu.Model.Cafe;




public interface CafeAPI {

    @GET("cafe/all")
    Call<Cafe> getAllResturant();

    @POST("cafe/create")
    Call<Cafe> insertResturant(@Body Cafe resturant, @Header("Authorization") String token);
}

package com.example.android_coupangeats.src.main.restaurant

import com.example.android_coupangeats.src.main.restaurant.models.InformationRestaurantResponse
import retrofit2.Call
import retrofit2.http.*

interface MenuRetrofitInterface {

    @GET("/app/stores/{storeNum}")
    fun getRestaurants(
        @Path("storeNum") storeNum: Int,
        @Query("user-address-idx") params: Int
    ) : Call<InformationRestaurantResponse>
}

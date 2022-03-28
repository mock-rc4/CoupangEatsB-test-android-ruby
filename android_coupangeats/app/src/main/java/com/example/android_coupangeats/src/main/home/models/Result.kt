package com.example.android_coupangeats.src.main.home.models


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("category_list")
    val categoryList: List<String>,
    @SerializedName("menu_list_stored_by_category")
    val menuListStoredByCategory: List<MenuStoredByCategory>,
    @SerializedName("store_address")
    val storeAddress: String,
    @SerializedName("store_buisness_hour")
    val storeBuisnessHour: String,
    @SerializedName("store_delivery_fee")
    val storeDeliveryFee: Int,
    @SerializedName("store_idx")
    val storeIdx: Int,
    @SerializedName("store_img_url")
    val storeImgUrl: List<String>,
    @SerializedName("store_info")
    val storeInfo: String,
    @SerializedName("store_join_date")
    val storeJoinDate: String,
    @SerializedName("store_lat")
    val storeLat: Double,
    @SerializedName("store_lng")
    val storeLng: Double,
    @SerializedName("store_max_delivery_time")
    val storeMaxDeliveryTime: Int,
    @SerializedName("store_max_prep_time")
    val storeMaxPrepTime: Int,
    @SerializedName("store_min_delivery_time")
    val storeMinDeliveryTime: Int,
    @SerializedName("store_min_order")
    val storeMinOrder: Int,
    @SerializedName("store_min_prep_time")
    val storeMinPrepTime: Int,
    @SerializedName("store_name")
    val storeName: String,
    @SerializedName("store_owner")
    val storeOwner: String,
    @SerializedName("store_owner_note")
    val storeOwnerNote: String,
    @SerializedName("store_phone")
    val storePhone: Int,
    @SerializedName("store_reg_num")
    val storeRegNum: String,
    @SerializedName("store_user_distance")
    val storeUserDistance: Double
)
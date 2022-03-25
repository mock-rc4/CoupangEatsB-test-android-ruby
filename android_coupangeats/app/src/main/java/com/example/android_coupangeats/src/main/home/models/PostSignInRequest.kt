package com.example.android_coupangeats.src.main.home.models

import com.google.gson.annotations.SerializedName

data class PostSignInRequest(
        @SerializedName("email") val email: String,
        @SerializedName("password") val password: String,
        @SerializedName("confirmPassword") val confirmPassword: String,
        @SerializedName("nickname") val nickname: String,
        @SerializedName("phoneNumber") val phoneNumber: String
)
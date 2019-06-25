package com.application.zomato.starter.network

import com.application.zomato.starter.data.PhotoModel
import retrofit2.Call
import retrofit2.http.GET

interface DataService {
    @GET("/photos")
    fun getAllPhotos(): Call<List<PhotoModel>>
}
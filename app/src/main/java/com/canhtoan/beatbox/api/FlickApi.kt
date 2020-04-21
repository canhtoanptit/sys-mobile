package com.canhtoan.beatbox.api

import com.canhtoan.beatbox.photogallery.FlickResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickApi {

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=e2a86bdbed073c56f33b5558f59ee7e9" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}
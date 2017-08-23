package com.liutao.demo.net

import com.liutao.demo.model.ImageModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by liutao on 2017/8/23.
 */
interface ApiService {
    @GET("福利/{size}/{page}")
    fun getImageList(@Path("size") size: Int, @Path("page") page: Int): Observable<ImageModel>
}
package com.liutao.demo.model

/**
 * Created by liutao on 2017/8/23.
 */
data class ImageModel(var error: Boolean, var results: List<ImageItem>) {

    data class ImageItem(var _id: String,
                         var createdAt: String,
                         var desc: String,
                         var publishedAt: String,
                         var source: String,
                         var type: String,
                         var url: String,
                         var isUsed: Boolean,
                         var who: String)
}
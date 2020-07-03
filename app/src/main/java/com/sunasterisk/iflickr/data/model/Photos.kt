package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Photos (

    @SerializedName("total")
    var total: String? = "",

    @SerializedName("photo")
    var photos: List<Photo>? = null
)

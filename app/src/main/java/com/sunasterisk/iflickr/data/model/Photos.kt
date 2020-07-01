package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Photos (

    @SerializedName("photo")
    val photos: List<Photo>? = null
)

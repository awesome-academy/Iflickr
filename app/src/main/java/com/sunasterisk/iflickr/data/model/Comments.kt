package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Comments (

    @SerializedName("comment")
    val comments: List<Comment>? = null
)

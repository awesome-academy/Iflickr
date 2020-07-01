package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class PhotoSetDescription(

    @SerializedName("_content")
    val content: String? = ""
)

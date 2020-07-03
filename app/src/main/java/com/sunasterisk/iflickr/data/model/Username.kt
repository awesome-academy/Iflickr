package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Username (

    @SerializedName("_content")
    var content: String? = ""
)

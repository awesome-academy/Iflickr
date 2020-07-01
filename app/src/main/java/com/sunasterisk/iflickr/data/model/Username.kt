package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Username(

    @SerializedName(CONTENT)
    val content: String? = ""
) {

    companion object {
        const val CONTENT = "_content"
    }
}

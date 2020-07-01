package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class FavoritePerson (

    @SerializedName("person")
    val user: User? = null
)

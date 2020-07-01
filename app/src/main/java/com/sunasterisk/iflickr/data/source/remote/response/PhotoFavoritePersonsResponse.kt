package com.sunasterisk.iflickr.data.source.remote.response

import com.google.gson.annotations.SerializedName
import com.sunasterisk.iflickr.data.model.FavoritePerson

data class PhotoFavoritePersonsResponse (

    @SerializedName("photo")
    val favoritePersons: List<FavoritePerson>? = null
)

package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class User(

    @SerializedName(NSID)
    val nsId: String? = "",

    @SerializedName(USER_NAME)
    val username: Username? = null,

    @SerializedName(FIRST_NAME)
    val firstName: String? = "",

    @SerializedName(LAST_NAME)
    val lastName: String? = "",

    @SerializedName(PROFILE_DESCRIPTION)
    val profileDescription: String? = "",

    @SerializedName(PUBLIC_PHOTOS)
    val publicPhotos: List<Photo>? = null,

    @SerializedName(HOMETOWN)
    val hometown: String? = "",

    @SerializedName(CITY)
    val city: String? = "",

    @SerializedName(COUNTRY)
    val country: String? = ""
) {

    companion object {
        const val NSID = "nsid"
        const val USER_NAME = "username"
        const val FIRST_NAME = "first_name"
        const val LAST_NAME = "last_name"
        const val PROFILE_DESCRIPTION = "profile_description"
        const val PUBLIC_PHOTOS = "photos"
        const val HOMETOWN = "hometown"
        const val CITY = "city"
        const val COUNTRY = "country"
    }
}

package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class PhotoSet (

    @SerializedName(ID)
    val id: String? = "",

    @SerializedName(OWNER)
    val owner: String? = "",

    @SerializedName(USER_NAME)
    val username: String? = "",

    @SerializedName(SECRET)
    val secret: String? = "",

    @SerializedName(SERVER)
    val server: String? = "",

    @SerializedName(FARM)
    val farm: String? = "",

    @SerializedName(COUNT_PHOTO)
    val countPhoto: String? = "",

    @SerializedName(TITLE)
    val title: PhotoSetTitle? = null
) {

    companion object {
        const val ID = "id"
        const val OWNER = "owner"
        const val USER_NAME = "username"
        const val SECRET = "secret"
        const val SERVER = "server"
        const val FARM = "farm"
        const val COUNT_PHOTO = "count_photo"
        const val TITLE = "title"
    }
}

package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Photo(

    @SerializedName(ID)
    val id: String? = "",

    @SerializedName(OWNER)
    val owner: String? = "",

    @SerializedName(SECRET)
    val secret: String? = "",

    @SerializedName(SERVER)
    val server: String? = "",

    @SerializedName(FARM)
    val farm: String? = "",

    @SerializedName(TITLE)
    val title: String? = ""
) {

    companion object {
        const val ID = "id"
        const val OWNER = "owner"
        const val SECRET = "secret"
        const val SERVER = "server"
        const val FARM = "farm"
        const val TITLE = "title"
    }
}

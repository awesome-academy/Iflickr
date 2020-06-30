package com.sunasterisk.iflickr.data.model

import com.google.gson.annotations.SerializedName

data class Comment (

    @SerializedName(ID)
    val id: String? = "",

    @SerializedName(AUTHOR_NAME)
    val authorName: String? = "",

    @SerializedName(ICON_SERVER)
    val iconServer: String? = "",

    @SerializedName(ICON_FARM)
    val iconFarm: String? = "",

    @SerializedName(REAL_NAME)
    val realName: String? = "",

    @SerializedName(CONTENT)
    val content: String? = ""
) {

    companion object {
        const val ID = "id"
        const val AUTHOR_NAME = "authorname"
        const val ICON_SERVER = "iconserver"
        const val ICON_FARM = "iconfarm"
        const val REAL_NAME = "realname"
        const val CONTENT = "_content"
    }
}

package com.sunasterisk.iflickr.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.sunasterisk.iflickr.data.model.Photo.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Photo (

    @PrimaryKey(autoGenerate = true)
    var photoId: Int? = null,

    @SerializedName(ID)
    var id: String? = "",

    @SerializedName(OWNER)
    var owner: String? = "",

    @SerializedName(SECRET)
    var secret: String? = "",

    @SerializedName(SERVER)
    var server: String? = "",

    @SerializedName(FARM)
    var farm: String? = "",

    @SerializedName(TITLE)
    var title: String? = ""
) {

    companion object {
        const val TABLE_NAME = "tbl_photo"
        const val ID = "id"
        const val OWNER = "owner"
        const val SECRET = "secret"
        const val SERVER = "server"
        const val FARM = "farm"
        const val TITLE = "title"
    }
}

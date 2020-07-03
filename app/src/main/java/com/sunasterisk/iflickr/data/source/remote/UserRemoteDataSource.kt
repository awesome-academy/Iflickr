package com.sunasterisk.iflickr.data.source.remote

import com.sunasterisk.iflickr.data.api.IFlickrApi
import com.sunasterisk.iflickr.data.source.UserDataSource

class UserRemoteDataSource(private val IFlickrApi: IFlickrApi) : UserDataSource.Remote {

    override fun findUserByUsername(username: String) = IFlickrApi.findUserByUsername(username)

    override fun getUserProfile(userId: String) = IFlickrApi.getUserProfile(userId)
}

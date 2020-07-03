package com.sunasterisk.iflickr.data.source.remote

import com.sunasterisk.iflickr.data.api.IFlickrApi
import com.sunasterisk.iflickr.data.source.PhotoDataSource

class PhotoRemoteDataSource(private val IFlickrApi: IFlickrApi) : PhotoDataSource.Remote {

    override fun getPublicPhotos(userId: String) = IFlickrApi.getPublicPhotos(userId)

    override fun getFavoritePersons(photoId: String) = IFlickrApi.getFavoritePersons(photoId)

    override fun getPhotoComments(photoId: String) = IFlickrApi.getPhotoComments(photoId)

    override fun getPhotoSets(userId: String) = IFlickrApi.getPhotoSets(userId)

    override fun getPhotoSetPhotos(
        userId: String,
        photoSetId: String
    ) = IFlickrApi.getPhotoSetPhotos(userId, photoSetId)
}

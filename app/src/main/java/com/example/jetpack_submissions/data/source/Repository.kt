package com.example.jetpack_submissions.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.jetpack_submissions.data.source.remote.RemoteDataSource
import com.example.jetpack_submissions.data.source.remote.response.MovieItem
import com.example.jetpack_submissions.data.source.remote.response.TVShowItem

class Repository private constructor(private val remoteDataSource: RemoteDataSource) : DataSource {

    private val remoteMoviesResult = MutableLiveData<ArrayList<MovieItem>>()
    private val remoteTVShowsResult = MutableLiveData<ArrayList<TVShowItem>>()

    private val _isOnloadingStates = MutableLiveData<Boolean>()
    val isOnloadingStates: LiveData<Boolean> = _isOnloadingStates

    private val _isConnectionSuccessful = MutableLiveData<Boolean>()
    val isConnectionSuccessful: LiveData<Boolean> = _isConnectionSuccessful

    companion object {

        @Volatile
        private var instance: Repository? = null

        fun getInstance(remoteDataSource: RemoteDataSource): Repository =
            instance ?: synchronized(this) {
                instance ?: Repository(remoteDataSource).apply { instance = this }
            }

    }

    override fun getAllRemoteMovies(): LiveData<ArrayList<MovieItem>> {
        remoteDataSource.getAllRemoteMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(moviesResponses: ArrayList<MovieItem>) {
                remoteMoviesResult.value = moviesResponses
            }

            override fun isOnLoadingStates(status: Boolean) {
                _isOnloadingStates.value = status
            }

            override fun isConnectionSuccessful(status: Boolean) {
                _isConnectionSuccessful.value = status
            }
        })
        return remoteMoviesResult
    }

    override fun getAllRemoteTVShows(): LiveData<ArrayList<TVShowItem>> {
        remoteDataSource.getAllRemoteTVShows(object : RemoteDataSource.LoadTVShowCallback {
            override fun onAllTVShowsReceived(tvshowResponses: ArrayList<TVShowItem>) {
                remoteTVShowsResult.value = tvshowResponses
            }

            override fun isOnLoadingStates(status: Boolean) {
                _isOnloadingStates.value = status
            }

            override fun isConnectionSuccessful(status: Boolean) {
                _isConnectionSuccessful.value = status
            }
        })
        return remoteTVShowsResult
    }

}
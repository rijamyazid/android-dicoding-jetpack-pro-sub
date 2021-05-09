package com.example.jetpack_submissions.ui.home.movies

import androidx.lifecycle.ViewModel
import com.example.jetpack_submissions.data.source.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun getAllRemoteMovies() = repository.getAllRemoteMovies()

}
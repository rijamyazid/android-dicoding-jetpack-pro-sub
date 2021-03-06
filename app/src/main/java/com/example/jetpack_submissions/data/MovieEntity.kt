package com.example.jetpack_submissions.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieEntity(
    var Id: String,
    var title: String,
    var director: String,
    var country: String,
    var releaseYear: String,
    var desc: String,
    var genre: List<String>,
    var imgPath: Int
):Parcelable

package com.example.jetpack_submissions.utils

import android.content.Context
import org.json.JSONException
import org.json.JSONObject

object GenreData {

    fun convertMovieGenres(context: Context, genreIds: List<String>): List<String> {
        val genresInString = arrayListOf<String>()
        val movieGenreMap = movieGenres(context)
        for (i in genreIds.indices) {
            if (genreIds[i] in movieGenreMap.keys) {
                genresInString.add(movieGenreMap[genreIds[i]] as String)
            }
        }
        return genresInString
    }

    fun convertTVShowGenres(context: Context, genreIds: List<String>): List<String> {
        val genresInString = arrayListOf<String>()
        val tvshowGenreMap = tvshowGenres(context)
        for (i in genreIds.indices) {
            if (genreIds[i] in tvshowGenreMap.keys) {
                genresInString.add(tvshowGenreMap[genreIds[i]] as String)
            }
        }
        return genresInString
    }

    private fun movieGenres(context: Context): Map<String, String> {
        val genresMap = mutableMapOf<String, String>()
        try {
            val objectResponse =
                JSONObject(JsonHelper(context).parsingFileToString("MovieGenres.json").toString())
            val genres = objectResponse.getJSONArray("genres")
            for (i in 0 until genres.length()) {
                val genre = genres.getJSONObject(i)

                val id = genre.getInt("id")
                val name = genre.getString("name")
                genresMap[id.toString()] = name
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return genresMap
    }

    private fun tvshowGenres(context: Context): Map<String, String> {
        val genresMap = mutableMapOf<String, String>()
        try {
            val objectResponse =
                JSONObject(JsonHelper(context).parsingFileToString("TVShowGenres.json").toString())
            val genres = objectResponse.getJSONArray("genres")
            for (i in 0 until genres.length()) {
                val genre = genres.getJSONObject(i)

                val id = genre.getInt("id")
                val name = genre.getString("name")
                genresMap[id.toString()] = name
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return genresMap
    }

}
package com.example.topmovies.repository

import com.example.topmovies.api.ApiServices
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api: ApiServices) {
    suspend fun moviesTopList(id: Int) = api.moviesTopList(id)
}
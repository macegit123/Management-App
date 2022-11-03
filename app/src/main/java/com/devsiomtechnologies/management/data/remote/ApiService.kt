package com.devsiomtechnologies.management.data.remote


import com.devsiomtechnologies.management.data.models.PostsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<PostsResponse>
}
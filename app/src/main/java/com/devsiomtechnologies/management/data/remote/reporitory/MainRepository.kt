package com.devsiomtechnologies.management.data.remote.reporitory

import com.devsiomtechnologies.management.data.local.db.AppDao
import com.devsiomtechnologies.management.data.remote.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService,
    localDataSource: AppDao
) {

    suspend fun getPosts() = apiService.getPosts()

}
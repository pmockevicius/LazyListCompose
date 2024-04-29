package com.example.lazylistcompose.data.dataSource.recipe.remote.api

import com.example.lazylistcompose.data.dataSource.recipe.remote.dto.RecipeDto
import retrofit2.Response
import retrofit2.http.GET

interface RecipeService {

    @GET("df15708c-77f1-4796-b5db-94dfdbdfbc98")
    suspend fun getEvents(): Response<List<RecipeDto>>
}
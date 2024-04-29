package com.example.lazylistcompose.data.dataSource.recipe.remote

import com.example.lazylistcompose.data.dataSource.recipe.RecipeDataSource
import com.example.lazylistcompose.data.dataSource.recipe.remote.api.RecipeService
import com.example.lazylistcompose.data.dataSource.recipe.remote.dto.RecipeDto
import retrofit2.Retrofit
import javax.inject.Inject

class RecipeRemoteDataSourceImpl @Inject constructor(private val retrofit: Retrofit) :
    RecipeDataSource {
    private val recipeService = retrofit.create(RecipeService::class.java)

    override suspend fun getRecipes(): List<RecipeDto> {
        return recipeService.getEvents().body() ?: emptyList()
    }
}
package com.example.lazylistcompose.data.dataSource.recipe

import com.example.lazylistcompose.data.dataSource.recipe.remote.dto.RecipeDto

interface RecipeDataSource {
    suspend fun getRecipes(): List<RecipeDto>
}

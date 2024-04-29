package com.example.lazylistcompose.domain.usecase

import com.example.lazylistcompose.domain.entity.Recipe

interface RecipeUsecase {
    suspend fun getRecipes() : List<Recipe>
}

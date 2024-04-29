package com.example.lazylistcompose.domain.repository.recipe

import com.example.lazylistcompose.domain.entity.Recipe

interface RecipeRepository {
    suspend fun getRecipes(): List<Recipe>
}

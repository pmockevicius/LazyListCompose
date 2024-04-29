package com.example.lazylistcompose.domain.usecase

import com.example.lazylistcompose.domain.entity.Recipe
import com.example.lazylistcompose.domain.repository.ErrorHandler
import com.example.lazylistcompose.domain.repository.recipe.RecipeRepository
import javax.inject.Inject

sealed class RecipeError : Exception() {
    object NoError : RecipeError()
    object UnknownError : RecipeError()
    object NoRecipeFounf : RecipeError()
}

class RecipeUsecaseImpl @Inject constructor(private val repository: RecipeRepository): RecipeUsecase,
    ErrorHandler {

    override suspend fun getRecipes(): List<Recipe> {
        try {
            return repository.getRecipes()
        } catch (e: Exception) {
            throw handle(e)
        }
    }

    override fun handle(e: Exception): Exception {
        return RecipeError.UnknownError
    }
}
package com.example.lazylistcompose.data.repository.recipe

import com.example.lazylistcompose.data.dataSource.recipe.RecipeDataSource
import com.example.lazylistcompose.data.dataSource.recipe.remote.dto.RecipeDto
import com.example.lazylistcompose.domain.entity.Recipe
import com.example.lazylistcompose.domain.repository.ErrorHandler
import com.example.lazylistcompose.domain.repository.Mapper
import com.example.lazylistcompose.domain.repository.recipe.RecipeRepository
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
    private val dataSource: RecipeDataSource,
    private val errorHandler: ErrorHandler) :
    RecipeRepository {
    private val localMapper = object : Mapper<Recipe, RecipeDto> {
        override fun toEntity(dataEntity: RecipeDto): Recipe {
            return Recipe(
                id = dataEntity.id ?: "",
                category = dataEntity.category ?: emptyList(),
                ingredients = dataEntity.ingredients ?: "",
                name = dataEntity.name ?: "",
                photo = dataEntity.photo ?: "",
                pasos = dataEntity.pasos ?: ""
            )
        }

        override fun toData(domainEntity: Recipe): RecipeDto {
            return RecipeDto(
                id = domainEntity.id,
                category = domainEntity.category,
                ingredients = domainEntity.ingredients,
                name = domainEntity.name,
                photo = domainEntity.photo,
                pasos = domainEntity.pasos
            )
        }
    }

    override suspend fun getRecipes(): List<Recipe> {
        try {
            return dataSource.getRecipes().map { localMapper.toEntity(it) }
        } catch (e: Exception) {
            throw errorHandler.handle(e)
        }
    }

}
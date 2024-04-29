package com.example.lazylistcompose.data.dataSource.recipe.remote.dto

data class RecipeDto(
    val category: List<String>? = null,
    val id: String? = null,
    val ingredients: String? = null,
    val name: String? = null,
    val photo: String? = null,
    val pasos: String? = null,
)

package com.example.lazylistcompose.domain.entity

data class Recipe(
    val category: List<String> = emptyList(),
    val id: String = "",
    val ingredients: String = "",
    val name: String = "",
    val photo: String = "",
    val pasos: String = "",
)

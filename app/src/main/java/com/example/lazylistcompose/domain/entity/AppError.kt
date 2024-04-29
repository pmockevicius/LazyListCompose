package com.example.lazylistcompose.domain.entity

sealed class AppError : Exception() {
    data class NetworkError(val code: Int, val body: String) : AppError()
    data class LocalDataSourceError(val body: String) : AppError()
    object NoInternet : AppError()
    object ResponseWithEmptyBody : AppError()
    object UnknownError : AppError()
}


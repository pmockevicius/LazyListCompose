package com.example.lazylistcompose.domain.repository

fun interface ErrorHandler {
    fun handle(e: Exception): Exception
}

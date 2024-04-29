package com.example.lazylistcompose.di

import com.example.lazylistcompose.domain.repository.ErrorHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.rudo.planning.data.errorHandler.DataSourceErrorHandlerImpl

@Module
@InstallIn(SingletonComponent::class)
class ErrorHandlerModule {
    @Provides
    fun provideDataSourceErrorHandler(): ErrorHandler =
        DataSourceErrorHandlerImpl()
}
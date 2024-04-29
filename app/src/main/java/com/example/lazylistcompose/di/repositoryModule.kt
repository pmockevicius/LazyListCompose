package com.example.lazylistcompose.di

import com.example.lazylistcompose.data.dataSource.recipe.RecipeDataSource
import com.example.lazylistcompose.data.dataSource.recipe.remote.RecipeRemoteDataSourceImpl
import com.example.lazylistcompose.data.repository.recipe.RecipeRepositoryImpl
import com.example.lazylistcompose.domain.repository.ErrorHandler
import com.example.lazylistcompose.domain.repository.recipe.RecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideRecipeRepository(remoteDataSource: RecipeDataSource,
                                errorHandler: ErrorHandler): RecipeRepository =
        RecipeRepositoryImpl(remoteDataSource, errorHandler)
}
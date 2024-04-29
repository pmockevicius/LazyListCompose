package com.example.lazylistcompose.di

import com.example.lazylistcompose.data.dataSource.recipe.RecipeDataSource
import com.example.lazylistcompose.data.dataSource.recipe.remote.RecipeRemoteDataSourceImpl
import com.example.lazylistcompose.domain.repository.recipe.RecipeRepository
import com.example.lazylistcompose.domain.usecase.RecipeUsecase
import com.example.lazylistcompose.domain.usecase.RecipeUsecaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class UsecaseModule {
    @Provides
    fun provideUsecaseModule(repository: RecipeRepository): RecipeUsecase =
        RecipeUsecaseImpl(repository)
}
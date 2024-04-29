package com.example.lazylistcompose.di

import com.example.lazylistcompose.data.dataSource.recipe.RecipeDataSource
import com.example.lazylistcompose.data.dataSource.recipe.remote.RecipeRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class DatasourceModule {
    @Provides
    fun provideRecipeRemoteDatasource(retrofit: Retrofit): RecipeDataSource =
       RecipeRemoteDataSourceImpl(retrofit)
}
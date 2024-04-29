package com.example.lazylistcompose.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lazylistcompose.domain.usecase.RecipeUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModelImpl @Inject constructor(private val usecase: RecipeUsecase) : ViewModel(),
    HomeScreenViewModel {

    override fun getRecipes() {
        viewModelScope.launch {
            try {
                usecase.getRecipes()
            } catch (e: Exception) {
                TODO("Update error state here")
            }
        }
    }

}
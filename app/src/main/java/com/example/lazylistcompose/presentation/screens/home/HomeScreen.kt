package com.example.lazylistcompose.presentation.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun HomeScreen() {

    val viewModel = hiltViewModel<HomeScreenViewModelImpl>()
    Text(modifier = Modifier.clickable(onClick = {viewModel.getRecipes()}),
        text = "Home Screen")
}
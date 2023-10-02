package com.example.newsapp.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(): ViewModel() {

    init {
        Log.i(TAG, "init block of NewsViewModel")
    }

    companion object{
        const val TAG = "NewsViewModel"
    }
}
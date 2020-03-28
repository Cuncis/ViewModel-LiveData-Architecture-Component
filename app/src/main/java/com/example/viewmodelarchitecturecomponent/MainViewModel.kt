package com.example.viewmodelarchitecturecomponent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val halo: LiveData<String> = MutableLiveData<String>()
        .also {
            it.value = "Halo Nurul"
        }

}
package com.example.viewmodelarchitecturecomponent

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Main2ViewModel: ViewModel() {

    val name: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}
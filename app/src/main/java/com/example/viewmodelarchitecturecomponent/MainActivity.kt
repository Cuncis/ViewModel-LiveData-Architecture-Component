package com.example.viewmodelarchitecturecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]
//        viewModel.halo.observe(this, Observer { tv_text.text = it })

        val viewModel = ViewModelProviders.of(this).get(Main2ViewModel::class.java)
        viewModel.name.postValue("Karang Reksa Ginolla")

        val nameObserver = Observer<String> { name ->
            tv_text.text = name
        }

        viewModel.name.observe(this, nameObserver)

    }
}

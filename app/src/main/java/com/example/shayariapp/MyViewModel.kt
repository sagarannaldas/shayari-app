package com.example.shayariapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MyViewModel(application: Application) : AndroidViewModel(application) {
    var shayariList = ArrayList<DataEntity>()

    fun getData(): ArrayList<DataEntity> {
        shayariList = SampleData.data as ArrayList<DataEntity>
        return shayariList
    }
}
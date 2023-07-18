package com.example.shayariapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MyViewModel(application: Application) : AndroidViewModel(application) {
    var shayariList = Repository.instant.list
}
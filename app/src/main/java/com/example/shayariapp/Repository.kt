package com.example.shayariapp

class Repository private constructor(){

    val list = SampleData.data

    companion object {
        val instant = Repository()
    }
}
package com.example.shayariapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayariapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var shayariList = ArrayList<DataEntity>()
    private val rvAdapter by lazy {
        RvAdapter(this, shayariList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shayariList.addAll(SampleData.data)
        binding.rvShayari.layoutManager = LinearLayoutManager(this)
        binding.rvShayari.adapter = rvAdapter

        binding.fab.setOnClickListener { view ->
           startActivity(Intent(this, AddEditActivity::class.java))
        }
    }
}
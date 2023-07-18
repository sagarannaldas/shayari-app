package com.example.shayariapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayariapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var shayariList = ArrayList<DataEntity>()
    private lateinit var myViewModel: MyViewModel
    private val rvAdapter by lazy {
        RvAdapter(this, shayariList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        binding.rvShayari.layoutManager = LinearLayoutManager(this)
        binding.rvShayari.adapter = rvAdapter

        rvAdapter.shayariList = myViewModel.shayariList
//            shayariList.addAll(SampleData.data)
        rvAdapter.notifyDataSetChanged()

        binding.fab.setOnClickListener { view ->
           startActivity(Intent(this, AddEditActivity::class.java))
        }
    }
}
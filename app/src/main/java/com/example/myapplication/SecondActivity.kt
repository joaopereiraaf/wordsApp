package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private var nameList : List<Words> = mutableListOf()
    private lateinit var classAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nameList = hashOfWords("esta é uma frase exemplo exemplo frase frase")
        classAdapter = ListAdapter(nameList)
        binding.apply {
            rvMain.apply {
                layoutManager= LinearLayoutManager(this@SecondActivity)
                adapter = classAdapter
            }
        }
    }
}
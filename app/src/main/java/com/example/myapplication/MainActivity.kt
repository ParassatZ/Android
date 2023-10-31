package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var colorAdapter: ColorAdapter
    private val colorList = listOf(
        ColorItem(Color.RED, "Red"),
        ColorItem(Color.GREEN, "Green"),
        ColorItem(Color.BLUE, "Blue"),
        ColorItem(Color.YELLOW, "Yellow"),
        ColorItem(Color.MAGENTA, "Magenta")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        colorAdapter = ColorAdapter(colorList)
        recyclerView.adapter = colorAdapter
    }
}

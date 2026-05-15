package com.example.raitha_vrata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tipAdapter: TipAdapter
    private lateinit var tipList: ArrayList<Tip>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        tipList = ArrayList()

        tipList.add(
            Tip(
                R.drawable.rice,
                "🌾 Rice Farming",
                "Use neem oil weekly to protect crops."
            )
        )

        tipList.add(
            Tip(
                R.drawable.coconutfarm,
                "🥥 Coconut Farming",
                "Add organic fertilizer every 15 days."
            )
        )

        tipList.add(
            Tip(
                R.drawable.rice,
                "💧 Water Saving",
                "Use drip irrigation to save water."
            )
        )

        tipAdapter = TipAdapter(tipList)

        recyclerView.adapter = tipAdapter
    }
}
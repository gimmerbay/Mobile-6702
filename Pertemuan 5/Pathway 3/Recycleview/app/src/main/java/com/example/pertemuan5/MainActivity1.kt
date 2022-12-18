package com.example.pertemuan5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuan5.adapter.adapter1
import com.example.pertemuan5.data.Source

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycleview1)

        val myDataset = Source().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.rv1)
        recyclerView.adapter = adapter1(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}
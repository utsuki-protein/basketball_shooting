package com.example.utsuki.basketball_shooting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val SaveButton: Button = findViewById(R.id.save)
        val TotalText: TextView = findViewById(R.id.Total)
        val CountText: TextView = findViewById(R.id.Count)
        SaveButton.setOnClickListener{
            var total: Int = Integer.valueOf(TotalText.text.toString())
            var count: Int = Integer.valueOf(CountText.text.toString())
            Log.d("TEST",  count.toString() + "/" + total.toString())
        }
    }
}

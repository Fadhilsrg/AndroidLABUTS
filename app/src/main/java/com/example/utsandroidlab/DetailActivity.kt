package com.example.utsandroidlab

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title") ?: ""
        val imageResId = intent.getIntExtra("image", 0)
        val chartResId = intent.getIntExtra("chart", 0)
        val unit = intent.getStringExtra("unit") ?: ""
        val averageValue = intent.getIntExtra("average", 0)
        val lowestValue = intent.getIntExtra("lowest", 0)
        val highestValue = intent.getIntExtra("highest", 0)

        findViewById<TextView>(R.id.detail_title).text = title
        findViewById<ImageView>(R.id.detail_image).setImageResource(imageResId)
        findViewById<ImageView>(R.id.detail_chart).setImageResource(chartResId)
        findViewById<TextView>(R.id.average_value).text = "$averageValue"
        findViewById<TextView>(R.id.average_value_unit).text = "$unit"
        findViewById<TextView>(R.id.lowest_value).text = "$lowestValue"
        findViewById<TextView>(R.id.lowest_value_unit).text = "$unit"
        findViewById<TextView>(R.id.highest_value).text = "$highestValue"
        findViewById<TextView>(R.id.highest_value_unit).text = "$unit"

        findViewById<Button>(R.id.btn_back).setOnClickListener {
            finish()
        }
    }
}
package com.example.utsandroidlab

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsandroidlab.adapter.CardAdapter
import com.example.utsandroidlab.model.CardItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val cardItems = listOf(
            CardItem(R.drawable.water_goals, "Water Goals", R.drawable.chart1, "ml", 2000, 1400, 2400),
            CardItem(R.drawable.calories_burned, "Calories Burned Daily", R.drawable.chart2, "cal", 2500, 1800, 3200),
            CardItem(R.drawable.steps_count, "Steps Count", R.drawable.chart3, "step", 800, 500, 1000),
            CardItem(R.drawable.sleep_tracker, "Sleep Tracker", R.drawable.chart4, "hrs", 7, 5, 9),
            CardItem(R.drawable.heart_rate, "Heart Rate Monitor", R.drawable.chart5, "bpm", 75, 60, 140),
            CardItem(R.drawable.mood_tracker, "Mood Tracker", R.drawable.chart6, "score", 8, 4, 10),
            CardItem(R.drawable.daily_meditation, "Daily Meditation Progress", R.drawable.chart7, "min", 30, 15, 60),
            CardItem(R.drawable.workout_times, "Workout Time Goals", R.drawable.chart8, "min", 45, 20, 90),
            CardItem(R.drawable.meal_log, "Meal Log", R.drawable.chart9, "kcal", 2000, 1500, 2500),
            CardItem(R.drawable.body_measurements, "Body Measurements", R.drawable.chart10, "kg", 65, 60, 70),
            CardItem(R.drawable.stress_levels, "Stress Levels", R.drawable.chart11, "score", 3, 1, 8),
            CardItem(R.drawable.mindful_breathing, "Mindful Breathing Exercises", R.drawable.chart12, "min", 15, 5, 30)
        )

        val adapter = CardAdapter(cardItems)
        recyclerView.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
package com.example.utsandroidlab.model

data class CardItem(
    val imageResId: Int,
    val title: String,
    val chartResId: Int,
    val unit: String,
    val averageValue: Int,
    val lowestValue: Int,
    val highestValue: Int
)

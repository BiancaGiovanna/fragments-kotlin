package com.example.testfragment.model

import android.graphics.drawable.Drawable
import java.io.FileDescriptor

data class Game(
    var id:Long,
    var gameName: String,
    var gameImage: Drawable,
    var gameDescription: String,
    var gameRating: Double,
    var console: List<Console>
) {

}
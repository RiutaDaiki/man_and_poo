package com.riuta.manandpoo

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView2)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val v = image as View
            val drawable = (v as ImageView).drawable as AnimatedVectorDrawable
            if (!drawable.isRunning) {
                drawable.start()
            }
        }
    }
}
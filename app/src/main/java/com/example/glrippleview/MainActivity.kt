package com.example.glrippleview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        glripplrId.run {
            addBackgroundImages(listOf(
                BitmapFactory.decodeResource(resources,R.drawable.wegz6),
                BitmapFactory.decodeResource(resources,R.drawable.wegz1),
                BitmapFactory.decodeResource(resources,R.drawable.wegz2),
                BitmapFactory.decodeResource(resources,R.drawable.wegz3),
                BitmapFactory.decodeResource(resources,R.drawable.wegz4),
                BitmapFactory.decodeResource(resources,R.drawable.wegz5),
            ))
            setRippleOffset(0.01f)
            setFadeInterval(2000)
            startCrossFadeAnimation()
        }
    }
}
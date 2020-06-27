package com.example.android.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import com.example.android.minipaint.canvas.MyCanvasView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val myCanvasView = MyCanvasView(this).apply {
            systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
            contentDescription = getString(R.string.canvasContentDescription)
        }

        setContentView(myCanvasView)


    }


}
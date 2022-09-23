package com.example.stockholmspokertest03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //Testrad 1
    //Testrad 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = ImageView(this)

        // setting height and width of imageview
        imageView.layoutParams= LinearLayout.LayoutParams(400, 400)
        //imageView.x = 200F // setting margin from left
        //imageView.y = 850F // setting margin from top

        // accessing our custom image which we added in drawable folder
        val imgResId = R.drawable.img
        var resId = imgResId

        // button onClick listener
        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener{
            imageView.setImageResource(resId)

            placeView(imageView)
            rotateView(imageView)

        }
        // accessing our relative layout from activity_main.xml
        val layout = findViewById<RelativeLayout>(R.id.layout)

        // Add ImageView to LinearLayout
        layout?.addView(imageView) // adding image to the layout

    }

    fun placeView(view : ImageView){
        var randomIntX = (10..700).random()
        view.x = randomIntX.toFloat()
        var randomIntY = (10..1600).random()
        view.y = randomIntY.toFloat()
    }

    fun rotateView(view : ImageView) {
        var randomInt = (0..360).random()
        view.rotation = randomInt.toFloat()
    }

}


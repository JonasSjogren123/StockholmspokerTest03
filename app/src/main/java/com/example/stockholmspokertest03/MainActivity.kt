package com.example.stockholmspokertest03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    //Testrad 1
    //Testrad 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val imageView01 = ImageView(this)
        val imageViewClub2 = ImageView(this)
        val imageViewClub3 = ImageView(this)
        val imageViewClub4 = ImageView(this)
        val imageViewClub5 = ImageView(this)
        val imageViewClub6 = ImageView(this)
        val imageViewClub7 = ImageView(this)
        val imageViewClub8 = ImageView(this)
        val imageViewClub9 = ImageView(this)
        val imageViewClub10 = ImageView(this)
        val imageViewClubJ = ImageView(this)
        val imageViewClubQ = ImageView(this)
        val imageViewClubK = ImageView(this)
        val imageViewClubA = ImageView(this)
        val imageViewDiamond2 = ImageView(this)
        val imageViewDiamond3 = ImageView(this)
        val imageViewDiamond4 = ImageView(this)



        // setting height and width of imageview
        imageViewClub2.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub3.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub4.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub5.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub6.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub7.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub8.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub9.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClub10.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClubJ.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClubQ.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClubK.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewClubA.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewDiamond2.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewDiamond3.layoutParams= LinearLayout.LayoutParams(400, 400)
        imageViewDiamond4.layoutParams= LinearLayout.LayoutParams(400, 400)
        //imageView.x = 200F // setting margin from left
        //imageView.y = 850F // setting margin from top

        // accessing our custom image which we added in drawable folder

        //val imgResId = R.drawable.playing_card_club_2
       // var resId = imgResId


        // button onClick listener
        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener{
            imageViewClub2.setImageResource(R.drawable.playing_card_club_2)
            imageViewClub3.setImageResource(R.drawable.playing_card_club_3)
            imageViewClub4.setImageResource(R.drawable.playing_card_club_4)
            imageViewClub5.setImageResource(R.drawable.playing_card_club_5)
            imageViewClub6.setImageResource(R.drawable.playing_card_club_6)
            imageViewClub7.setImageResource(R.drawable.playing_card_club_7)
            imageViewClub8.setImageResource(R.drawable.playing_card_club_8)
            imageViewClub9.setImageResource(R.drawable.playing_card_club_9)
            imageViewClub10.setImageResource(R.drawable.playing_card_club_10)
            imageViewClubJ.setImageResource(R.drawable.playing_card_club_j)
            imageViewClubQ.setImageResource(R.drawable.playing_card_club_q)
            imageViewClubK.setImageResource(R.drawable.playing_card_club_k)
            imageViewClubA.setImageResource(R.drawable.playing_card_club_a)
            imageViewDiamond2.setImageResource(R.drawable.playing_card_diamond_2)
            imageViewDiamond3.setImageResource(R.drawable.playing_card_diamond_3)
            imageViewDiamond4.setImageResource(R.drawable.playing_card_diamond_4)

            placeView(imageViewClub2)
            rotateView(imageViewClub2)
            placeView(imageViewClub3)
            rotateView(imageViewClub3)
            placeView(imageViewClub4)
            rotateView(imageViewClub4)
            placeView(imageViewClub5)
            rotateView(imageViewClub5)
            placeView(imageViewClub6)
            rotateView(imageViewClub6)
            placeView(imageViewClub7)
            rotateView(imageViewClub7)
            placeView(imageViewClub8)
            rotateView(imageViewClub8)
            placeView(imageViewClub9)
            rotateView(imageViewClub9)
            placeView(imageViewClub10)
            rotateView(imageViewClub10)
            placeView(imageViewClubJ)
            rotateView(imageViewClubJ)
            placeView(imageViewClubQ)
            rotateView(imageViewClubQ)
            placeView(imageViewClubK)
            rotateView(imageViewClubK)
            placeView(imageViewClubA)
            rotateView(imageViewClubA)
            placeView(imageViewDiamond2)
            rotateView(imageViewDiamond2)
            placeView(imageViewDiamond3)
            rotateView(imageViewDiamond3)
            placeView(imageViewDiamond4)
            rotateView(imageViewDiamond4)

        }
        // accessing our relative layout from activity_main.xml
        val layout = findViewById<RelativeLayout>(R.id.layout)

        // Add ImageView to LinearLayout
        layout?.addView(imageViewClub2) // adding image to the layout
        layout?.addView(imageViewClub3)
        layout?.addView(imageViewClub4)
        layout?.addView(imageViewClub5)
        layout?.addView(imageViewClub6)
        layout?.addView(imageViewClub7)
        layout?.addView(imageViewClub8)
        layout?.addView(imageViewClub9)
        layout?.addView(imageViewClub10)
        layout?.addView(imageViewClubJ)
        layout?.addView(imageViewClubQ)
        layout?.addView(imageViewClubK)
        layout?.addView(imageViewClubA)
        layout?.addView(imageViewDiamond2)
        layout?.addView(imageViewDiamond3)
        layout?.addView(imageViewDiamond4)

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


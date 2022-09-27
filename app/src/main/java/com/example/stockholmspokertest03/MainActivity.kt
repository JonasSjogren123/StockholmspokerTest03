package com.example.stockholmspokertest03

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

        var numberOfCards: Int = 16
        val rankJack: Int = 11
        val rankQueen: Int = 12
        val rankKing: Int = 13
        val rankAce: Int = 14

    //lateinit var viewTest1: ImageView
/*
    lateinit var imageViewClub2 : ImageView
    lateinit var imageViewClub3 : ImageView
    lateinit var imageViewClub4 : ImageView
    lateinit var imageViewClub5 : ImageView
    lateinit var imageViewClub6 : ImageView
    lateinit var imageViewClub7 : ImageView
    lateinit var imageViewClub8 : ImageView
    lateinit var imageViewClub9 : ImageView
    lateinit var imageViewClub10 : ImageView
    lateinit var imageViewClubJack : ImageView
    lateinit var imageViewClubQueen : ImageView
    lateinit var imageViewClubKing : ImageView
    lateinit var imageViewClubAce : ImageView
    lateinit var imageViewDiamond2 : ImageView
    lateinit var imageViewDiamond3 : ImageView
    lateinit var imageViewDiamond4 : ImageView
 */


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val imageViewClub2 = ImageView(this)
            val imageViewClub3 = ImageView(this)
            val imageViewClub4 = ImageView(this)
            val imageViewClub5 = ImageView(this)
            val imageViewClub6 = ImageView(this)
            val imageViewClub7 = ImageView(this)
            val imageViewClub8 = ImageView(this)
            val imageViewClub9 = ImageView(this)
            val imageViewClub10 = ImageView(this)
            val imageViewClubJack = ImageView(this)
            val imageViewClubQueen = ImageView(this)
            val imageViewClubKing = ImageView(this)
            val imageViewClubAce = ImageView(this)
            val imageViewDiamond2 = ImageView(this)
            val imageViewDiamond3 = ImageView(this)
            val imageViewDiamond4 = ImageView(this)






            // setting height and width of imageview
            imageViewClub2.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub3.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub4.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub5.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub6.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub7.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub8.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub9.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClub10.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClubJack.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClubQueen.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClubKing.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewClubAce.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewDiamond2.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewDiamond3.layoutParams = LinearLayout.LayoutParams(400, 400)
            imageViewDiamond4.layoutParams = LinearLayout.LayoutParams(400, 400)
            //imageView.x = 200F // setting margin from left
            //imageView.y = 850F // setting margin from top

            // accessing our custom image which we added in drawable folder

            //val imgResId = R.drawable.playing_card_club_2
            // var resId = imgResId



            // button onClick listener
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                imageViewClub2.setImageResource(R.drawable.playing_card_club_2)
                imageViewClub3.setImageResource(R.drawable.playing_card_club_3)
                imageViewClub4.setImageResource(R.drawable.playing_card_club_4)
                imageViewClub5.setImageResource(R.drawable.playing_card_club_5)
                imageViewClub6.setImageResource(R.drawable.playing_card_club_6)
                imageViewClub7.setImageResource(R.drawable.playing_card_club_7)
                imageViewClub8.setImageResource(R.drawable.playing_card_club_8)
                imageViewClub9.setImageResource(R.drawable.playing_card_club_9)
                imageViewClub10.setImageResource(R.drawable.playing_card_club_10)
                imageViewClubJack.setImageResource(R.drawable.playing_card_club_jack)
                imageViewClubQueen.setImageResource(R.drawable.playing_card_club_queen)
                imageViewClubKing.setImageResource(R.drawable.playing_card_club_king)
                imageViewClubAce.setImageResource(R.drawable.playing_card_club_ace)
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
                placeView(imageViewClubJack)
                rotateView(imageViewClubJack)
                placeView(imageViewClubQueen)
                rotateView(imageViewClubQueen)
                placeView(imageViewClubKing)
                rotateView(imageViewClubKing)
                placeView(imageViewClubAce)
                rotateView(imageViewClubAce)
                placeView(imageViewDiamond2)
                rotateView(imageViewDiamond2)
                placeView(imageViewDiamond3)
                rotateView(imageViewDiamond3)
                placeView(imageViewDiamond4)
                rotateView(imageViewDiamond4)

                addPlayingCardViewsRandomly()
                //shufflePlayingCardViews()

            }
            // accessing our relative layout from activity_main.xml
            val layout = findViewById<RelativeLayout>(R.id.layout)

            val galleryCardSlot = ImageView(this)
            galleryCardSlot.layoutParams = LinearLayout.LayoutParams(400, 400)
            galleryCardSlot.setImageResource(R.drawable.playing_card_empty)
            placeView(galleryCardSlot)
            layout?.addView(galleryCardSlot)

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
            layout?.addView(imageViewClubJack)
            layout?.addView(imageViewClubQueen)
            layout?.addView(imageViewClubKing)
            layout?.addView(imageViewClubAce)
            layout?.addView(imageViewDiamond2)
            layout?.addView(imageViewDiamond3)
            layout?.addView(imageViewDiamond4)



        }

        fun placeView(view: ImageView) {
            var randomIntX = (10..700).random()
            view.x = randomIntX.toFloat()
            var randomIntY = (10..1600).random()
            view.y = randomIntY.toFloat()
        }

        fun rotateView(view: ImageView) {
            var randomInt = (0..360).random()
            view.rotation = randomInt.toFloat()
        }


        fun addPlayingCardViewsRandomly(){

       // numberOfCards = 4

        //var randomCardNumber = (1..numberOfCards!!).random()
        //layout?.addView(imageViewClub)

            // var list = mutableListOf(imageViewClub2, imageViewClub3, imageViewClub4, imageViewClub5)
            // var randomElements = list.asSequence().shuffled().take(numberOfElements).toList()
            //
            // list.removeIf { i -> randomElements.contains(i) }
            //var list = mutableListOf(imageViewClub2, imageViewClub3, imageViewClub4, imageViewClub5)
            var listOfInts = mutableListOf<Int>(2,3,4,5,6,7,8,9,10,rankJack, rankQueen,rankKing, rankAce)
            var listOfRandomInts = listOfInts.toMutableList()
            listOfRandomInts.shuffle()
            Log.d("!!!","listOfInts$listOfInts")
            Log.d("!!!","listOfRandomInts$listOfRandomInts")
    }
/*
    fun shufflePlayingCardViews() {
        var listOfMutableCards = mutableListOf<ImageView>(imageViewClub2,imageViewClub3,imageViewClub4,imageViewClub5,imageViewClub6,imageViewClub7,imageViewClub8,imageViewClub9,imageViewClub10,imageViewClubJack,imageViewClubQueen,imageViewClubKing,imageViewClubAce,imageViewDiamond2,imageViewDiamond3,imageViewDiamond4)
        var listOfMutableCardsRandom = listOfMutableCards.toMutableList()
        listOfMutableCardsRandom.shuffle()

        Log.d("!!!","listOfMutableCards$listOfMutableCards")
        Log.d("!!!","listOfMutableCardsRandom$listOfMutableCardsRandom")
    }
*/
}


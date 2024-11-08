package com.example.triviaactivity13

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class CongratsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)

        val imgCongrats: ImageView = findViewById(R.id.img_congratulations)
        val tvCongratsMessage: TextView = findViewById(R.id.tv_congratulations)
        val tvAdditionalMessage: TextView = findViewById(R.id.tv_additional_message)
        val btnNewGame: Button = findViewById(R.id.btn_new_game)


        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val slideIn = AnimationUtils.loadAnimation(this, R.anim.slide_in)


        imgCongrats.startAnimation(fadeIn)
        tvCongratsMessage.startAnimation(slideIn)
        tvAdditionalMessage.startAnimation(fadeIn)
        btnNewGame.startAnimation(slideIn)


        btnNewGame.setOnClickListener {

            finish()

        }

        Glide.with(this)
            .asGif()
            .load(R.drawable.confetti_cute)
            .into(imgCongrats)

    }
}

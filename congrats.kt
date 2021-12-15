package com.example.quizapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class congrats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var score = intent.getIntExtra("score", score)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)
        var con = findViewById<TextView>(R.id.congrats)
        con.text = ("Congrats you scored a $score out of 5!")
    }
}
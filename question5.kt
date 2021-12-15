//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/
package com.example.quizapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        var question = findViewById<TextView>(R.id.question)
        var score = intent.getIntExtra("score",score)
        var answera = findViewById<TextView>(R.id.a)
        var answerb = findViewById<TextView>(R.id.b)
        var answerc = findViewById<TextView>(R.id.c)
        var answerd = findViewById<TextView>(R.id.d)
        var check = findViewById<TextView>(R.id.check)
        var intent = Intent(this,congrats::class.java)
        question.text = ("Question 5:What is the best-selling handheld system to date?")
        answera.setText("Nintendo DS")
        answerb.setText("PSP")
        answerc.setText("GameBoy")
        answerd.setText("Nintendo Switch")
        answera.setOnClickListener() {
            check.text = ("correct")
            score++
            intent.putExtra("score",score)
            startActivity(intent)
        }
        answerb.setOnClickListener() {
            check.text = ("incorrect")
            intent.putExtra("score",score)
            startActivity(intent)
        }
        answerc.setOnClickListener() {
            check.text = ("incorrect")
            intent.putExtra("score",score)
            startActivity(intent)
        }
        answerd.setOnClickListener() {
            check.text = ("incorrect")
            intent.putExtra("score",score)
            startActivity(intent)
        }

    }

}
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/
package com.example.quizapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
var score = 0
class question : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        var question = findViewById<TextView>(R.id.question)

        var answera = findViewById<TextView>(R.id.a)
        var answerb = findViewById<TextView>(R.id.b)
        var answerc = findViewById<TextView>(R.id.c)
        var answerd = findViewById<TextView>(R.id.d)
        var check= findViewById<TextView>(R.id.check)
        var intent = Intent(this,question2::class.java)
        question.text = ("Question 1:What is the name of the protagonist in the halo franchise?")
            answera.setText("Steve")
            answerb.setText("Master Chief")
            answerc.setText("Bubsy")
            answerd.setText("Halo dude")
            answera.setOnClickListener() {
              check.text = ("incorrect")
               intent.putExtra("score",score)
              startActivity(intent)

            }
            answerb.setOnClickListener() {
                 check.text = ("correct")
                 score++
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
package com.example.quizapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var enterb = findViewById<Button>(R.id.enter)
        enterb.setOnClickListener(){
            var start = Intent(this,question::class.java)
            startActivity(start)

        }
    }
}
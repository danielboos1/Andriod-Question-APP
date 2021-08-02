package com.example.quizeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val button: Button = findViewById(R.id.btn_start)
        button.setOnClickListener {
            val text = findViewById<View>(R.id.et_name) as EditText
            val value = text.text.toString()
            if (value.isEmpty()) {

                Toast.makeText(this,"Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
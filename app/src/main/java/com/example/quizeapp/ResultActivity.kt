package com.example.quizeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val username = intent.getStringExtra(Constants.USER_NAME)
        val tv_name = findViewById<TextView>(R.id.tv_name)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val CorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        val tv_score = findViewById<TextView>(R.id.tv_score)
        tv_score.text = "Your Score is $CorrectAnswers out of $totalQuestions"

        val btn_finish = findViewById<Button>(R.id.btn_finish)
        btn_finish.setOnClickListener {
 startActivity(Intent(this, MainActivity::class.java))
            finish()

        }

    }
}
package com.example.scholarshipmanagementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.done_tab.*

class DoneTab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.done_tab)

        feedbackbttn.setOnClickListener{
            startActivity(Intent(this, Feedback::class.java))
        }
        Signout.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
    }
}
}
package com.example.scholarshipmanagementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.feedback.*

class Feedback : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feedback)

        signout2.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

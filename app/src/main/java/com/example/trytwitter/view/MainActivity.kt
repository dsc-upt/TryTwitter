package com.example.trytwitter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window;
import com.example.trytwitter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        supportActionBar?.hide(); //hide the title bar
        setContentView(R.layout.activity_main)
    }
}
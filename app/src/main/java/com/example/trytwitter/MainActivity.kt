package com.example.trytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.trytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel


        mainViewModel.onLoginButtonClicked.observe(this) { value ->
            if (value) {
                if (mainViewModel.login()) {
                    Toast.makeText(this, "Valid", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Invalid", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
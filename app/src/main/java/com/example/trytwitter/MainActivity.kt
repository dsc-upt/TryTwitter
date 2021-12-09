package com.example.trytwitter

import Mapper.UserMapper
import Model.User
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import com.example.trytwitter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(getLayoutInflater())

        setContentView(binding.root)

        binding.lifecycleOwner = this

        var x: Boolean = false
        val user = UserMapper.Users()
        binding.button.setOnClickListener {
            for (i in user) {

                if (binding.editText.text.toString() == i.username.toString() && binding.editText2.text.toString() == i.password.toString()) {
                    x = true
                    break
                }

            }
            if (x) {
                Toast.makeText(this, "Conectare reusita !", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Conectare esuata !", Toast.LENGTH_SHORT).show()
            }
            x = false
        }
    }
}
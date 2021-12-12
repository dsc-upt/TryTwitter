package com.example.trytwitter

import Mapper.UserMapper
import Model.User
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast
import androidx.activity.viewModels
import androidx.viewbinding.ViewBinding
import com.example.trytwitter.databinding.ActivityMainBinding
import kotlin.reflect.KProperty


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(getLayoutInflater())


        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel

        mainViewModel.onLoginButtonClicked.observe(this) { value ->

            if (value) {

                if (mainViewModel.login()) {

                    Toast.makeText(this, "Conectare reusita! ", Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(this, "Conectare esuata! ", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}




/*  }
  var isTrue: Boolean = false
  val user = UserMapper.Users()
  binding.button.setOnClickListener {
      for (i in user) {

          if (binding.editText.text.toString() == i.username.toString() && binding.editText2.text.toString() == i.password.toString()) {
              isTrue = true
              break
          }

      }
      if (isTrue) {
          Toast.makeText(this, "Conectare reusita! ", Toast.LENGTH_SHORT).show()

      } else {
          Toast.makeText(this, "Conectare esuata! ", Toast.LENGTH_SHORT).show()
      }
      isTrue = false
  }
}
}*/
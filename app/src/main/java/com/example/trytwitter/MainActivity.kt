package com.example.trytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.trytwitter.databinding.LoginLayoutBinding
import mapper.UserModelMapper

class MainActivity : AppCompatActivity() {
    lateinit var binding: LoginLayoutBinding
    val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: LoginLayoutBinding = LoginLayoutBinding.inflate(getLayoutInflater())

        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel

        mainViewModel.onLoginButtonClicked.observe(this) { value ->
            if (value) {
                if (mainViewModel.login()) {
                    Toast.makeText(this, "Operatie reusita!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Operatie NEreusita!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        /*binding.button.setOnClickListener {
            for (i in userList) {
                if (binding.usernameText.text.toString() == i.username.toString() && binding.passwordText.text.toString() == i.password.toString()) {
                    isUserValid = true
                    break
                }
            }
            if (isUserValid) {
                Toast.makeText(this, "Login credentials are valid.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login credentials are NOT valid.", Toast.LENGTH_SHORT).show()
            }
            isUserValid = false
        }*/

    }
}
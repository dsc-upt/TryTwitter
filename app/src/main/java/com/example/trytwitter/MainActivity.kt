package com.example.trytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.businesss.UserModel
import com.example.trytwitter.databinding.LoginLayoutBinding
import mapper.UserModelMapper

class MainActivity : AppCompatActivity() {
    lateinit var binding: LoginLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: LoginLayoutBinding = LoginLayoutBinding.inflate(getLayoutInflater())

        setContentView(binding.root)

        val user = UserModelMapper.returnListOfUsers()
        var ok : Boolean = false

        binding.lifecycleOwner = this
        binding.button.setOnClickListener{
            for(i in user)
            {
                if(binding.usernameText.text.toString() == i.username.toString() && binding.passwordText.text.toString() == i.password.toString()) {
                    ok = true
                    break
                }
            }
            if(ok)
                Toast.makeText(this, "Login credentials are valid.", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Login credentials are NOT valid.", Toast.LENGTH_SHORT).show()
            ok = false
        }
    }



}
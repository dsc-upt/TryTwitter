package com.example.trytwitter

import Mapper.UserMapper
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData





    class MainViewModel(application: Application) : AndroidViewModel(application) {

        //val x = application.applicationContext
        val name = MutableLiveData("")
        val password = MutableLiveData("")
        val onLoginButtonClicked = MutableLiveData(false)

        fun onClickLoginButton() {
            onLoginButtonClicked.value = true
        }

        fun login(): Boolean {
            val userList = UserMapper.Users()
            for (user in userList) {
                if (user.username == name.value && user.password == password.value) {
                    return true
                }
            }
            return false
        }

    }

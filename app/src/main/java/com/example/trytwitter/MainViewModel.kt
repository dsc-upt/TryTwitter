package com.example.trytwitter

import android.app.Application
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import mapper.UserModelMapper

class MainViewModel(application: Application) : AndroidViewModel(application) {

    //val x = application.applicationContext
    val name = MutableLiveData("")
    val password = MutableLiveData("")
    val onLoginButtonClicked = MutableLiveData(false)

    fun onClickLoginButton() {
        onLoginButtonClicked.value = true
    }

    fun login(): Boolean {
        val userList = UserModelMapper.returnListOfUsers()
        for (user in userList) {
            if (user.username == name.value && user.password == password.value) {
                return true
            }
        }
        return false
    }

}
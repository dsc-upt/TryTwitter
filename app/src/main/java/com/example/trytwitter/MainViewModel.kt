package com.example.trytwitter

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.bussiness.UserMapper


class MainViewModel(application: Application) : AndroidViewModel(application) {
    //val x=application.applicationContext
    val name = MutableLiveData("")
    val password = MutableLiveData("")
    val onLoginButtonClicked = MutableLiveData(false)

    fun login(): Boolean {
        val userList = UserMapper.getUsersList()
        for (user in userList) {
            if (user.name == name.value && user.password == password.value) {
                return true
            }
        }
        return false
    }

    fun onClickLoginButton() {
        onLoginButtonClicked.value = true
    }


}
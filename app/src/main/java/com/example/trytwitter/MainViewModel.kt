package com.example.trytwitter

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.bussiness.UserMapper

class MainViewModel(application : Application): AndroidViewModel(application) {
    // val x = application.applicationContext //se poate modifica context aplicatie
    val name = MutableLiveData("")
    val password = MutableLiveData("")
    val onLoginButtonClicked = MutableLiveData(false)

    fun login(): Boolean {
        val usersList = UserMapper.getUsersList()
        for (user in usersList) {
            if (user.nume == name.value && user.parola == password.value) {
                return true
            }
        }
        return false
    }

    fun onClickLoginButton() {
        onLoginButtonClicked.value = true
    }
}
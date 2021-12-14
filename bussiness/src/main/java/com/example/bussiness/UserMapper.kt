package com.example.bussiness

import com.example.bussiness.User

class UserMapper {
    companion object {
        fun getUsersList(): List<User> {
            return mutableListOf(User("user","user"),User("password","password"))
        }
    }
}
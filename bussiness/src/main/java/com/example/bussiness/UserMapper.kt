package com.example.bussiness

class UserMapper {
    companion object {
        fun getUsersList(): List<User> {
            val usersList = mutableListOf<User>()
            for (i in 0..5) {
                usersList.add(User("admin${i}","admin${i}"))
            }
            return usersList
        }
    }
}
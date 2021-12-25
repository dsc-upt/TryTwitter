package com.example.trytwitter.model

class UserMapper {
    private val users = arrayListOf<User>()

    init {
        users.add(User("user1","password1"))
        users.add(User("user2","password2"))
        users.add(User("user3","password3"))
        users.add(User("user4","password4"))
    }

    fun getUsers() = users
}
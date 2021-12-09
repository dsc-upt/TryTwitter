package Mapper

import Model.User

class UserMapper{
    companion object{

        fun Users() :List<User>{

        return mutableListOf(User("kotlin","kotlin"), User("vali","vali"))

        }
    }


}
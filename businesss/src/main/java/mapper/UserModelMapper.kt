package mapper

import com.example.businesss.UserModel

class UserModelMapper {
        companion object{
                fun returnListOfUsers() : List<UserModel>{
                        //return UserModel(username = "admin", password = "admin")
                        return mutableListOf(UserModel("admin", "admin"), UserModel("george", "george"))
                }
        }

}
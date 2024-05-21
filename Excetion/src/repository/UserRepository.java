package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> getAllUser(){
        List<User>userList =new ArrayList<>(
                List.of(new
                        User(1,"Nana","Female", "Nana123@gmail.com.kh","k#$56bhc"),
                        new User(2,"KoKo","koko456@gmail.com","%^%$&#%@234567","Male"))
        ); return userList;

    }
}

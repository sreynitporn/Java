package service;

import excetion.UserValidatorExcetion;
import model.User;

import java.util.List;

public class UserServiceImp implements UserService{
    @Override
    public List<User> getAllUser() {
        return List.of();
    }

    @Override
    public List<User> getGetAllUsers() {
        return List.of();
    }

    @Override
    public User findUserById(Integer id) throws UserValidatorExcetion {
        return null;
    }
}

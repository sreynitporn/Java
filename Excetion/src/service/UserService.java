package service;

import excetion.UserValidatorExcetion;
import model.User;

import java.util.List;

public interface UserService {
    List<User>getAllUser();
    List<User>getGetAllUsers();
    User findUserById(Integer id) throws UserValidatorExcetion;
}

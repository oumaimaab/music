package service;

import database.impl.UserRepository;
import model.User;

/**
 * @author Elattar Saad
 */
public class UserService {

    public static void register(User user){
        new UserRepository().save(user);
    }

    public static User login(String username, String password){
        return new UserRepository().login(username,password);
    }

}

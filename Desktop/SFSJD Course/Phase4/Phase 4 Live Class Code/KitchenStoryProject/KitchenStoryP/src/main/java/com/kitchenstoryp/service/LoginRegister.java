package com.kitchenstoryp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenstoryp.entity.User;
import com.kitchenstoryp.repository.UserRepository;

@Service
public class LoginRegister {

	@Autowired
    UserRepository ur;
    public boolean registerUser(User user){

        List<User> userList = ur.findAll();

        boolean userExists = false;

        if(userList != null) {
            for (User us : userList) {
                if (user.getEmail().equals(us.getEmail())) {
                    userExists = true;
                }
            }
        }

        if(userExists){
            return true;
        }else{
            ur.save(user);
            return false;
        }
    }

    public boolean loginUser(User user){

        List<User> userList = ur.findAll();

        boolean userAuthorized = false;

        if(userList != null) {
            for (User us : userList) {
                if (user.getEmail().equals(us.getEmail())) {
                    if(user.getPassword().equals(us.getPassword())) {
                        userAuthorized = true;
                    }
                    break;
                }
            }
        }

        if(userAuthorized){
            return true;
        }else{
            return false;
        }
    }

    public boolean adminLogin(User user){

        List<User> userList = ur.findAll();

        boolean adminAuthorized = false;

        if(userList != null) {
            for (User us : userList) {
                if (user.getEmail().equals(us.getEmail())) {
                    if(user.getPassword().equals(us.getPassword())) {
                        if(us.isAdmin()) {
                            adminAuthorized = true;
                        }
                    }
                    break;
                }
            }
        }

        if(adminAuthorized){
            return true;
        }else{
            return false;
        }
    }
}

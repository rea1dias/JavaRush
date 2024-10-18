package com.example.javarush.Service;

import com.example.javarush.Entity.User;
import com.example.javarush.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {

    }


}

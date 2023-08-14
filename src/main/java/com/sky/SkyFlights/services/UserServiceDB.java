package com.sky.SkyFlights.services;


import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.repos.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class UserServiceDB implements UserService {

    public UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUserById(int userID) {
        Optional<User> optionalUser = userRepo.findById(userID);
        return optionalUser.get();
    }

//    @Override
//    public List<User> getAllUsers() {
//        return userRepo.findAll();
//    }

//    @Override
//    public User updateUser(User user) {
//        User existingUser = userRepo.findById(user.getId()).get();
//        existingUser.setFirstName(user.getFirstName());
//        existingUser.setLastName(user.getLastName());
//        existingUser.setEmail(user.getEmail());
//        User updatedUser = userRepo.save(existingUser);
//        return updatedUser;
//    }
//
//    @Override
//    public void deleteUser(int userID) {
//        userRepo.deleteById(userID);
//    }
}
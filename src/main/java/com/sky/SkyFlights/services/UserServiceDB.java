package com.sky.SkyFlights.services;


import com.sky.SkyFlights.domain.MyUserDetails;
import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.repos.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Component
public class UserServiceDB implements UserService{

    public UserRepo userRepo;

    private BCryptPasswordEncoder encoder;

    public UserServiceDB(UserRepo userRepo, BCryptPasswordEncoder encoder) {
        super();
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    @Override
    public String registerUser(User user) {
        user.setPassword(this.encoder.encode(user.getPassword()));
        User saved = this.userRepo.save(user);
        return saved.getUsername();
    }

    @Override
    public User getUserById(int userID) {
        Optional<User> optionalUser = userRepo.findById(userID);
        return optionalUser.get();
    }

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

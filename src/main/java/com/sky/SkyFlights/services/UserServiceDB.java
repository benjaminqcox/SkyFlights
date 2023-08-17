package com.sky.SkyFlights.services;



import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.repos.UserRepo;
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


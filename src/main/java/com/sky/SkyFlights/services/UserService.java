package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.dtos.UserLoginDTO;


public interface UserService {
    String registerUser(User user);
    User getUserById(int userId);
}

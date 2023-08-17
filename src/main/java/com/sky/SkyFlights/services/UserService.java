package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {
    String registerUser(User user);
    User getUserById(int userId);
}

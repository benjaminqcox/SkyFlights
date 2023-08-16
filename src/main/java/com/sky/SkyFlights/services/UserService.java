package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(int userId);

    User findByEmailAndPassword(String email, String password);
}

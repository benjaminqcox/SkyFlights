package com.sky.SkyFlights.repos;


import com.sky.SkyFlights.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);


}

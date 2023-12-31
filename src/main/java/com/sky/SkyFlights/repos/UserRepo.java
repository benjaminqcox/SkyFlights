package com.sky.SkyFlights.repos;


import com.sky.SkyFlights.domain.Booking;
import com.sky.SkyFlights.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String userName);

}

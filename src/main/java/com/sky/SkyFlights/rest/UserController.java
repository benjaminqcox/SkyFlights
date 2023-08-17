package com.sky.SkyFlights.rest;

import com.sky.SkyFlights.domain.Booking;
import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.dtos.UserLoginDTO;
import com.sky.SkyFlights.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody @Validated User user) {

        return this.userService.registerUser(user);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int userID){
        User user = userService.getUserById(userID);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/user")
    public String getCurrentUser() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @GetMapping("/getByUsername/{username}")
    public ResponseEntity<User> getBookingByUsername(@PathVariable("username") String username) {
        User user = userService.getBookingByUsername(username);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/getUserID/{username}")
    public ResponseEntity<Integer> getUsername(@PathVariable("username") String username) {
        User user = userService.getBookingByUsername(username);
        int userID = user.getUserID();
        return new ResponseEntity<>(userID, HttpStatus.OK);
    }

}


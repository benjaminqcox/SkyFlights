package com.sky.SkyFlights.rest;

import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.dtos.UserLoginDTO;
import com.sky.SkyFlights.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody @Validated User user){

        return this.userService.registerUser(user);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int userID){
        User user = userService.getUserById(userID);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


//    @GetMapping("/findByEmailAndPassword/{email}/{password}")
//    public ResponseEntity<User> findByEmailAndPassword(@PathVariable("email") String email,@PathVariable("password") String password ){
//        User user = userService.findByEmailAndPassword(email,password);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }

    }


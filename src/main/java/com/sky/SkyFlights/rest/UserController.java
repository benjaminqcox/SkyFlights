package com.sky.SkyFlights.rest;

import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.dtos.UserLoginDTO;
import com.sky.SkyFlights.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserLoginDTO> createUser(@RequestBody @Validated User user){
        User savedUser = userService.createUser(user);
        UserLoginDTO userloginDTO= new UserLoginDTO();
        BeanUtils.copyProperties(savedUser,userloginDTO);
        return new ResponseEntity<>(userloginDTO, HttpStatus.CREATED);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int userID){
        User user = userService.getUserById(userID);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping("/findByEmailAndPassword/{email}/{password}")
    public ResponseEntity<UserLoginDTO> findByEmailAndPassword(@PathVariable("email") String email,@PathVariable("password") String password ){
        User user = userService.findByEmailAndPassword(email,password);
        UserLoginDTO userloginDTO= new UserLoginDTO();
        BeanUtils.copyProperties(user,userloginDTO);
        return new ResponseEntity<>(userloginDTO, HttpStatus.OK);
    }

//    @GetMapping("/findByEmailAndPassword/{email}/{password}")
//    public ResponseEntity<User> findByEmailAndPassword(@PathVariable("email") String email,@PathVariable("password") String password ){
//        User user = userService.findByEmailAndPassword(email,password);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }

    }


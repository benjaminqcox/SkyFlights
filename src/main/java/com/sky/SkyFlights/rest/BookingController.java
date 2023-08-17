package com.sky.SkyFlights.rest;


import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.Booking;
import com.sky.SkyFlights.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    public UserService userService;
    @Autowired
    public BookingService bookingService;
    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
        Booking savedBooking = bookingService.createBooking(booking);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }

    @GetMapping("/getByUserID/{id}")
    public ResponseEntity<Booking> getBookingByUserId(@PathVariable("id") int userID){
        Booking booking = bookingService.getBookingByUserId(userID);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

    @GetMapping("/getByUsername/{username}")
    public ResponseEntity<Booking> getBookingByUsername(@PathVariable("username") String username) {
        Booking booking = bookingService.getBookingByUsername(username);
        return new ResponseEntity<>(booking, HttpStatus.OK);
    }

}



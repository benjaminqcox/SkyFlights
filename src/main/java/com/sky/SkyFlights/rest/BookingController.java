package com.sky.SkyFlights.rest;


import com.sky.SkyFlights.dtos.UserLoginDTO;
import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.Booking;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.services.UserService;
import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.beans.BeanUtils;

import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchURIBuilder;
import com.sky.SkyFlights.domain.apiResponseDomain.LocationResponse;
import com.sky.SkyFlights.domain.apiResponseDomain.locationSearchURIBuilder;
import com.sky.SkyFlights.dtos.FlightDTO;
import com.sky.SkyFlights.services.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.awt.print.Book;
import java.io.Console;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;


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

    private FlightService service;

    public BookingController(FlightService service) {
        this.service = service;
    }


    private com.sky.SkyFlights.domain.APIQueryParams APIQueryParams;


    @GetMapping("/flights/get/")
    public List<FlightDTO> getOneWayFlights(@RequestParam(value = "flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo) {

        return this.service.getOneWayFlights(flyFrom, flyTo, leaveDateFrom, leaveDateTo);
    }


    @GetMapping("/flights/getFiltered/")
    public List<FlightDTO> getOneWayFlightsFiltered(@RequestParam(value = "flyFrom", required = true) String flyFrom, @RequestParam(value = "flyTo", required = true) String flyTo, @RequestParam(value = "leaveDateFrom", required = true) String leaveDateFrom, @RequestParam(value = "leaveDateTo", required = true) String leaveDateTo, @RequestParam(value = "numberOfAdults", required = true) String numberOfAdults, @RequestParam(value = "numberOfChildren", defaultValue = "0") String numberOfChildren, @RequestParam(value = "stopovers", defaultValue = "0") String stopovers, @RequestParam(value = "currency", defaultValue = "GBP") String currency, @RequestParam(value = "priceFrom", defaultValue = "0") String priceFrom, @RequestParam(value = "priceTo", defaultValue = "20000") String priceTo, @RequestParam(value = "cabin", defaultValue = "M") String cabin, @RequestParam(value = "weekdaysOnly", defaultValue = "false") String weekdaysOnly, @RequestParam(value = "weekendsOnly", defaultValue = "false") String weekendsOnly) {


        return this.service.getOneWayFlightsFiltered(flyFrom, flyTo, leaveDateFrom, leaveDateTo, numberOfAdults, numberOfChildren, stopovers, currency, priceFrom, priceTo, cabin, weekdaysOnly, weekendsOnly);
    }


    @GetMapping("/flights/getReturn/")
    public List<FlightDTO> getReturnFlights(@RequestParam(value = "flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo, @RequestParam("returnDateFrom") String returnDateFrom, @RequestParam("returnDateTo") String returnDateTo) {

        return this.service.getReturnFlights(flyFrom, flyTo, leaveDateFrom, leaveDateTo, returnDateFrom, returnDateTo);
    }

    @GetMapping("/flights/getReturnFiltered/")
    public List<FlightDTO> getReturnFlightsFiltered(@RequestParam(value = "flyFrom", required = true) String flyFrom, @RequestParam(value = "flyTo", required = true) String flyTo, @RequestParam(value = "leaveDateFrom", required = true) String leaveDateFrom, @RequestParam(value = "leaveDateTo", required = true) String leaveDateTo, @RequestParam("returnDateFrom") String returnDateFrom, @RequestParam("returnDateTo") String returnDateTo, @RequestParam(value = "numberOfAdults", required = true) String numberOfAdults, @RequestParam(value = "numberOfChildren", defaultValue = "0") String numberOfChildren, @RequestParam(value = "stopovers", defaultValue = "0") String stopovers, @RequestParam(value = "currency", defaultValue = "GBP") String currency, @RequestParam(value = "priceFrom", defaultValue = "0") String priceFrom, @RequestParam(value = "priceTo", defaultValue = "20000") String priceTo, @RequestParam(value = "cabin", defaultValue = "M") String cabin, @RequestParam(value = "weekdaysOnly", defaultValue = "false") String weekdaysOnly, @RequestParam(value = "weekendsOnly", defaultValue = "false") String weekendsOnly) {

        return this.service.getReturnFlightsFiltered(flyFrom, flyTo, leaveDateFrom, leaveDateTo, returnDateFrom, returnDateTo, numberOfAdults, numberOfChildren, stopovers, currency, priceFrom, priceTo, cabin, weekdaysOnly, weekendsOnly);
    }

}



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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import com.sky.SkyFlights.domain.apiResponseDomain.*;

import java.awt.print.Book;
import java.io.Console;
import java.util.Date;

@RestController
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


    //changes by Jake below this line only
    private final WebClient localApiClient;

    @Autowired
    public BookingController(WebClient localApiClient) {
        this.localApiClient = localApiClient;
    }

    @GetMapping("/get/{term}")
    public LocationResponse getLocation(@PathVariable String term) {
        LocationResponse response = new LocationResponse();
        response = localApiClient
                .get()
                .uri("/locations/query?term=" + term +"&locale=en-US&location_types=airport&limit=1&active_only=true")
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(LocationResponse.class)
                .block();
    return response;
    }

    @GetMapping("/get/")

    public FlightSearchResponse getOneWayFlights(@RequestParam("flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo) {
        return localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom+ "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&max_fly_duration=20&ret_from_diff_city=false&ret_to_diff_city=false&one_for_city=1&one_per_date=1&adults=2&selected_cabins=M&adult_hold_bag=1,0&adult_hand_bag=1,1&only_working_days=false&only_weekends=false&partner_market=us&curr=GBP&locale=gb&max_stopovers=1&max_sector_stopovers=1&vehicle_type=aircraft&limit=1")
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();
    }
}

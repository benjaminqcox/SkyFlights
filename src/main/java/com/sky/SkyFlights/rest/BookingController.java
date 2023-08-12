package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.FlightSearchAPI.flightSearchURIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import com.sky.SkyFlights.domain.apiResponseDomain.*;

import java.util.Date;

@RestController
@RequestMapping("/booking")
public class BookingController {

//    private BookingService service;
//
//    public BookingController(BookingService service) {
//        this.service = service;
//    }

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
                .uri("/locations/query?term=" + term + locationSearchURIBuilder.uriBuilder())
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
                .uri("/v2/search?fly_from=" + flyFrom+ "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + flightSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();
    }
}

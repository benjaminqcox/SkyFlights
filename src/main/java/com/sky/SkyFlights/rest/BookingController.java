package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
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
                .uri("/v2/search?fly_from=" + flyFrom+ "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&max_fly_duration=20&ret_from_diff_city=false&ret_to_diff_city=false&one_for_city=1&one_per_date=1&adults=2&selected_cabins=M&adult_hold_bag=1,0&adult_hand_bag=1,1&only_working_days=false&only_weekends=false&partner_market=us&curr=GBP&locale=gb&max_stopovers=1&max_sector_stopovers=1&vehicle_type=aircraft&limit=1")
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();
    }
}

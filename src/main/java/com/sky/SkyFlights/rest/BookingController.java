package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import com.sky.SkyFlights.domain.apiResponseDomain.*;
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
        return localApiClient
                .get()
                .uri("/locations/query?term=" + term +"&locale=en-US&location_types=airport&limit=2&active_only=true")
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(LocationResponse.class)
                .block();
    }

    @GetMapping("/get/{flyFrom},{flyTo},{leaveDateFrom},{leaveDateTo}")
    public FlightSearchResponse getOneWayFlights(@PathVariable String flyFrom, @PathVariable String flyTo, @PathVariable String leaveDateFrom, @PathVariable String leaveDateTo) {
        return localApiClient
                .get()
                .uri("https://api.tequila.kiwi.com/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&max_fly_duration=20&ret_from_diff_city=false&ret_to_diff_city=false&one_for_city=1&one_per_date=1&adults=2&selected_cabins=M&adult_hold_bag=1%2C0&adult_hand_bag=1%2C1&only_working_days=false&only_weekends=false&partner_market=us&curr=GBP&locale=gb&max_stopovers=1&max_sector_stopovers=1&vehicle_type=aircraft&limit=1")
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();
    }
}

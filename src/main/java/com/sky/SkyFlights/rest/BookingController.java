package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.FlightSearchAPI.Datum;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.FlightSearchAPI.flightSearchURIBuilder;
import com.sky.SkyFlights.dtos.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import com.sky.SkyFlights.domain.apiResponseDomain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

//    @GetMapping("/get/{term}")
//    public LocationResponse getLocation(@PathVariable String term) {
//         LocationResponse response = localApiClient
//                .get()
//                .uri("/locations/query?term=" + term + locationSearchURIBuilder.uriBuilder())
//                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
//                .retrieve()
//                .bodyToMono(LocationResponse.class)
//                .block();
//
//
//    }

    @GetMapping("/get/")
    public List<FlightDTO> getOneWayFlights(@RequestParam("flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo) {
        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom+ "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + flightSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();
        List<FlightDTO> flightDTOs = new ArrayList<>();
        List<Datum> datums = response.getData();

        for (int i = 0; i < datums.size(); i++) {
            FlightDTO flightDTO = new FlightDTO(datums.get(i).getLocalDeparture(), datums.get(i).getLocalArrival(), datums.get(i).getFlyFrom(), datums.get(i).getFlyTo(), datums.get(i).getDuration(), datums.get(i).getFare(), datums.get(i).getAirlines());
            System.out.println(datums.get(i).getLocalDeparture());
            System.out.println(datums.get(i).getLocalArrival());
            System.out.println(flightDTO.toString());
            flightDTOs.add(flightDTO);
        }

        return flightDTOs;
    }

}

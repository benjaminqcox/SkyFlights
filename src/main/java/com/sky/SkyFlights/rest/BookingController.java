package com.sky.SkyFlights.rest;


import com.sky.SkyFlights.domain.Location;
//import com.sky.SkyFlights.services.BookingService;
import org.springframework.http.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

//    private BookingService service;
//
//    public BookingController(BookingService service) {
//        this.service = service;
//    }

    @GetMapping("/get/{term}")
    public String getLocation(@PathVariable String term) {
        String uri = "https://api.tequila.kiwi.com/locations/query?term=" + term +"&locale=en-US&location_types=airport&limit=2&active_only=true";
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3");
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Void> RequestEntity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, RequestEntity, String.class);
        return response.getBody();
    }
}

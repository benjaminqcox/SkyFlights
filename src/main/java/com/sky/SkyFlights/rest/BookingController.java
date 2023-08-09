package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.LocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Block;
import org.springframework.http.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

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


//        String uri = "https://api.tequila.kiwi.com/locations/query?term=" + term +"&locale=en-US&location_types=airport&limit=2&active_only=true";
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3");
//        RestTemplate restTemplate = new RestTemplate();
//        HttpEntity<Void> RequestEntity = new HttpEntity<>(headers);
//        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, RequestEntity, String.class);
    }
}

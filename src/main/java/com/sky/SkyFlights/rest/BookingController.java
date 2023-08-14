package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.FlightSearchAPI.flightSearchURIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public FlightSearchResponse getOneWayFlights(@RequestParam("flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo) throws InterruptedException {
       return localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + flightSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

//        List<FlightDTO> flightDTOs = new ArrayList<>();
//        System.out.println(response.getData());
//        for (int i = 0; i < response.getData().size(); i++) {
//            FlightDTO flightDTO = new FlightDTO();
//            flightDTO.setLocal_departure(response.getData().get(i).getLocalDeparture());
//            flightDTO.setLocal_arrival(response.getData().get(i).getLocalArrival());
//            flightDTO.setFlyFrom(response.getData().get(i).getFlyFrom());
//            flightDTO.setFlyTo(response.getData().get(i).getFlyTo());
//            flightDTO.setDuration(String.valueOf(response.getData().get(i).getDuration()));
//            flightDTO.setFare(String.valueOf(response.getData().get(i).getFare()));
//            flightDTO.setAirline(response.getData().get(i).getAirlines());
//            System.out.println(flightDTO.toString());
//            flightDTOs.add(flightDTO);
//
//        }
//        return flightDTOs;
    }
}

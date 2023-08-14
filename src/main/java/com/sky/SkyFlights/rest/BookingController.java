package com.sky.SkyFlights.rest;


//import com.sky.SkyFlights.services.BookingService;
import com.sky.SkyFlights.domain.APIQueryParams;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.FlightSearchAPI.flightSearchURIBuilder;
import com.sky.SkyFlights.domain.apiResponseDomain.LocationResponse;
import com.sky.SkyFlights.domain.apiResponseDomain.locationSearchURIBuilder;
import com.sky.SkyFlights.dtos.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
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

    @GetMapping("/get/{term}")
    public LocationResponse getLocation(@PathVariable String term) {
         LocationResponse response = localApiClient
                .get()
                .uri("/locations/query?term=" + term + locationSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(LocationResponse.class)
                .block();
        return response;

    }

    @GetMapping("/get/")
    public List<FlightDTO> getOneWayFlights(@RequestParam(value = "flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo) {

        // return a Mono of FlightSearchResponse, which will contain a huge amount of data
        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + flightSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

        // create a list of flightDTOs, each their own flight option, with only the relevant information needed for the front-end

        List<FlightDTO> flightDTOs = new ArrayList<>();

        for (int i = 0; i < response.getData().size(); i++) {
            FlightDTO flightDTO = new FlightDTO();

            //getData() returns a list of Datums, so needs getData().get(i) to retrieve each Datum within the list
            flightDTO.setLocal_departure(response.getData().get(i).getLocalDeparture());
            flightDTO.setLocal_arrival(response.getData().get(i).getLocalArrival());
            flightDTO.setFlyFrom(response.getData().get(i).getFlyFrom());
            flightDTO.setFlyTo(response.getData().get(i).getFlyTo());
            flightDTO.setDuration(response.getData().get(i).getDuration());
            flightDTO.setFare(response.getData().get(i).getFare());
            flightDTO.setAirline(response.getData().get(i).getAirlines());

            flightDTOs.add(flightDTO);
        }
        return flightDTOs;
    }

    @GetMapping("/getFiltered/")
    public List<FlightDTO> getOneWayFlightsFiltered(@RequestParam("flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo, @RequestParam(value = "numberOfAdults", defaultValue = "2") String numberOfAdults, @RequestParam(value = "numberOfChildren", defaultValue = "0") String numberOfChildren, @RequestParam(value = "stopovers", defaultValue = "0") String stopovers, @RequestParam(value = "currency", defaultValue = "gbp") String currency, @RequestParam(value = "priceFrom", defaultValue = "0") String priceFrom, @RequestParam(value = "priceTo", defaultValue = "20000") String priceTo, @RequestParam(value = "cabin", defaultValue = "M") String cabin, @RequestParam(value = "weekdaysOnly", defaultValue = "false") String weekdaysOnly, @RequestParam(value = "weekendsOnly", defaultValue = "false") String weekendsOnly) {

        // return a Mono of FlightSearchResponse, which will contain a huge amount of data
        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&adults=" + numberOfAdults + "&children=" + numberOfChildren + "&max_stopovers=" + stopovers + "&curr=" + currency + "&price_from=" + priceFrom + "&price_to=" + priceTo + "&selected_cabins=" + cabin + "&only_working_days=" + weekdaysOnly + "&only_weekends=" + weekendsOnly + flightSearchURIBuilder.uriBuilderFiltered())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

        // create a list of flightDTOs, each their own flight option, with only the relevant information needed for the front-end

        List<FlightDTO> flightDTOs = new ArrayList<>();

        for (int i = 0; i < response.getData().size(); i++) {
            FlightDTO flightDTO = new FlightDTO();

            //getData() returns a list of Datums, so needs getData().get(i) to retrieve each Datum within the list
            flightDTO.setLocal_departure(response.getData().get(i).getLocalDeparture());
            flightDTO.setLocal_arrival(response.getData().get(i).getLocalArrival());
            flightDTO.setFlyFrom(response.getData().get(i).getFlyFrom());
            flightDTO.setFlyTo(response.getData().get(i).getFlyTo());
            flightDTO.setDuration(response.getData().get(i).getDuration());
            flightDTO.setFare(response.getData().get(i).getFare());
            flightDTO.setAirline(response.getData().get(i).getAirlines());

            flightDTOs.add(flightDTO);
        }
        return flightDTOs;
    }
}

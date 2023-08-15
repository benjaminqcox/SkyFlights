package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.APIQueryParams;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchURIBuilder;
import com.sky.SkyFlights.dtos.FlightDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@Primary
@Service
public class FlightServiceAPI implements FlightService{


    private WebClient localApiClient;


    @Autowired
    public FlightServiceAPI(WebClient localApiClient) {
        this.localApiClient = localApiClient;
    }


    @Override
    public List<FlightDTO> getOneWayFlights(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo) {

        APIQueryParams apiQueryParams= new APIQueryParams();
        FlightSearchURIBuilder flightSearchURIBuilder = new FlightSearchURIBuilder();

        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + flightSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

        // create a list of flightDTOs, each their own flight option, with only the relevant information needed for the front-end

        if (response == null) System.out.println("oops");
        System.out.println(response);
        System.out.printf(response.getData().get(0).getCityFrom());
        List<FlightDTO> flightDTOs = new ArrayList<>();

        for (int i = 0; i < response.getData().size(); i++) {
            FlightDTO flightDTO = new FlightDTO();

            //getData() returns a list of Datums, so needs getData().get(i) to retrieve each Datum within the list
            flightDTO.setLocal_departure(response.getData().get(i).getLocalDeparture());
            flightDTO.setLocal_arrival(response.getData().get(i).getLocalArrival());
            flightDTO.setFlyFrom(response.getData().get(i).getFlyFrom());
            flightDTO.setFlyTo(response.getData().get(i).getFlyTo());
            flightDTO.setDuration(response.getData().get(i).getDuration().getTotal().longValue());
            flightDTO.setFare(response.getData().get(i).getFare());
            flightDTO.setAirline(response.getData().get(i).getAirlines());

            flightDTOs.add(flightDTO);
        }
        System.out.println(flightDTOs);
        return flightDTOs;
    }

    @Override
    public List<FlightDTO> getOneWayFlightsFiltered(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String numberOfAdults, String numberOfChildren, String stopovers, String currency, String priceFrom, String priceTo, String cabin, String weekdaysOnly, String weekendsOnly) {
        //Handbag and holdbag numbers must match number of adults and children, so for each adult, build handbag and holdbag params with +1

//        APIQueryParams apiQueryParams= new APIQueryParams();
        FlightSearchURIBuilder flightSearchURIBuilder = new FlightSearchURIBuilder();

        String adultBagString = "1";
        for (int i = 0; i < parseInt(numberOfAdults) - 1; i++) {
            adultBagString += ",0";
        }


        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&adults=" + numberOfAdults + "&children=" + numberOfChildren + "&max_stopovers=" + stopovers + "&curr=" + currency + "&price_from=" + priceFrom + "&price_to=" + priceTo + "&selected_cabins=" + cabin + "&only_working_days=" + weekdaysOnly + "&only_weekends=" + weekendsOnly + flightSearchURIBuilder.uriBuilderFiltered(adultBagString))
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

        // create a list of flightDTOs, each their own flight option, with only the relevant information needed for the front-end
        String uri = "/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&adults=" + numberOfAdults + "&children=" + numberOfChildren + "&max_stopovers=" + stopovers + "&curr=" + currency + "&price_from=" + priceFrom + "&price_to=" + priceTo + "&selected_cabins=" + cabin + "&only_working_days=" + weekdaysOnly + "&only_weekends=" + weekendsOnly + flightSearchURIBuilder.uriBuilderFiltered(adultBagString);

        List<FlightDTO> flightDTOs = new ArrayList<>();

        for (int i = 0; i < response.getData().size(); i++) {
            FlightDTO flightDTO = new FlightDTO();

            //getData() returns a list of Datums, so needs getData().get(i) to retrieve each Datum within the list
            flightDTO.setLocal_departure(response.getData().get(i).getLocalDeparture());
            flightDTO.setLocal_arrival(response.getData().get(i).getLocalArrival());
            flightDTO.setFlyFrom(response.getData().get(i).getFlyFrom());
            flightDTO.setCityFrom(response.getData().get(i).getCityFrom());
            flightDTO.setFlyTo(response.getData().get(i).getFlyTo());
            flightDTO.setCityTo(response.getData().get(i).getCityTo());
            flightDTO.setDuration(response.getData().get(i).getDuration().getTotal().longValue());
            flightDTO.setFare(response.getData().get(i).getFare());
            flightDTO.setAirline(response.getData().get(i).getAirlines());
            flightDTO.setAvailability(response.getData().get(i).getAvailability());


            flightDTOs.add(flightDTO);
        }
        return flightDTOs;
    }
}

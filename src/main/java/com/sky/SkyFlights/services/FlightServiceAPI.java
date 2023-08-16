package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.APIQueryParams;
import com.sky.SkyFlights.domain.FlightSearchAPI.Datum;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchResponse;
import com.sky.SkyFlights.domain.FlightSearchAPI.FlightSearchURIBuilder;
import com.sky.SkyFlights.domain.FlightSearchAPI.Route;
import com.sky.SkyFlights.dtos.FlightDTO;
import org.apache.tomcat.Jar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
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


            Datum data = response.getData().get(i);
            FlightDTO flightDTO = new FlightDTO.FlightDTOBuilder().setLocalDeparture(data.getLocalDeparture()).setLocalArrival(data.getLocalArrival()).setCityFrom(data.getCityFrom()).setFlyFrom(data.getFlyFrom()).setCityTo(data.getCityTo()).setFlyTo(data.getFlyTo()).setDuration(data.getDuration().getTotal().longValue()).setFare(data.getFare()).setAirlines(data.getAirlines()).setAvailability(data.getAvailability()).setRoutes(data.getRoute()).build();
            flightDTOs.add(flightDTO);

        }
        return flightDTOs;
    }

    @Override
    public List<FlightDTO> getOneWayFlightsFiltered(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String numberOfAdults, String numberOfChildren, String stopovers, String currency, String priceFrom, String priceTo, String cabin, String weekdaysOnly, String weekendsOnly) {
        //Handbag and holdbag numbers must match number of adults and children, so for each adult, build handbag and holdbag params with +1

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

        List<FlightDTO> flightDTOs = new ArrayList<>();

        for (int i = 0; i < response.getData().size(); i++) {


            Datum data = response.getData().get(i);
            FlightDTO flightDTO = new FlightDTO.FlightDTOBuilder().setLocalDeparture(data.getLocalDeparture()).setLocalArrival(data.getLocalArrival()).setCityFrom(data.getCityFrom()).setFlyFrom(data.getFlyFrom()).setCityTo(data.getCityTo()).setFlyTo(data.getFlyTo()).setDuration(data.getDuration().getTotal().longValue()).setFare(data.getFare()).setAirlines(data.getAirlines()).setAvailability(data.getAvailability()).setRoutes(data.getRoute()).build();
            flightDTOs.add(flightDTO);

        }
        return flightDTOs;
    }

    @Override
    public List<FlightDTO> getReturnFlights(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String returnDateFrom, String returnDateTo) {

        FlightSearchURIBuilder flightSearchURIBuilder = new FlightSearchURIBuilder();

        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&date_to=" + leaveDateTo + "&return_from=" + returnDateFrom + "&return_to=" + returnDateTo + flightSearchURIBuilder.uriBuilder())
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

        if (response == null) System.out.println("oops");
        System.out.println(response.getData().get(0).getRoute().get(1));
        List<FlightDTO> flightDTOs = new ArrayList<>();

        for (int i = 0; i < response.getData().size(); i++) {


            Datum data = response.getData().get(i);
            FlightDTO flightDTO = new FlightDTO.FlightDTOBuilder().setLocalDeparture(data.getLocalDeparture()).setLocalArrival(data.getLocalArrival()).setCityFrom(data.getCityFrom()).setFlyFrom(data.getFlyFrom()).setCityTo(data.getCityTo()).setFlyTo(data.getFlyTo()).setDuration(data.getDuration().getTotal().longValue()).setFare(data.getFare()).setAirlines(data.getAirlines()).setAvailability(data.getAvailability()).setRoutes(data.getRoute()).build();
            flightDTOs.add(flightDTO);

        }
        return flightDTOs;
    }

    @Override
    public List<FlightDTO> getReturnFlightsFiltered(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String returnDateFrom, String returnDateTo, String numberOfAdults, String numberOfChildren, String stopovers, String currency, String priceFrom, String priceTo, String cabin, String weekdaysOnly, String weekendsOnly) {

        FlightSearchURIBuilder flightSearchURIBuilder = new FlightSearchURIBuilder();

        String adultBagString = "1";
        for (int i = 0; i < parseInt(numberOfAdults) - 1; i++) {
            adultBagString += ",0";
        }

        FlightSearchResponse response = localApiClient
                .get()
                .uri("/v2/search?fly_from=" + flyFrom + "&fly_to=" + flyTo + "&date_from=" + leaveDateFrom + "&return_from=" + returnDateFrom + "&return_to=" + returnDateTo + "&date_to=" + leaveDateTo + "&adults=" + numberOfAdults + "&children=" + numberOfChildren + "&max_stopovers=" + stopovers + "&curr=" + currency + "&price_from=" + priceFrom + "&price_to=" + priceTo + "&selected_cabins=" + cabin + "&only_working_days=" + weekdaysOnly + "&only_weekends=" + weekendsOnly + flightSearchURIBuilder.uriBuilderFiltered(adultBagString))
                .header("apikey", "9ptw_en0a60KfjnlnslcQcSRz6QjkbQ3")
                .retrieve()
                .bodyToMono(FlightSearchResponse.class)
                .block();

        List<FlightDTO> flightDTOs = new ArrayList<>();
        System.out.println(response.getData().get(0).getRoute());
        List<Route> route = response.getData().get(0).getRoute();
        System.out.println(route);

        for (int i = 0; i < response.getData().size(); i++) {


            Datum data = response.getData().get(i);
            FlightDTO flightDTO = new FlightDTO.FlightDTOBuilder().setLocalDeparture(data.getLocalDeparture()).setLocalArrival(data.getLocalArrival()).setCityFrom(data.getCityFrom()).setFlyFrom(data.getFlyFrom()).setCityTo(data.getCityTo()).setFlyTo(data.getFlyTo()).setDuration(data.getDuration().getTotal().longValue()).setFare(data.getFare()).setAirlines(data.getAirlines()).setAvailability(data.getAvailability()).setRoutes(data.getRoute()).build();
            flightDTOs.add(flightDTO);

        }
        return flightDTOs;
    }


}

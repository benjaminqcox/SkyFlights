package com.sky.SkyFlights.services;

import com.sky.SkyFlights.dtos.FlightDTO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FlightService {

    List<FlightDTO> getOneWayFlights(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo);

    List<FlightDTO> getOneWayFlightsFiltered(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String numberOfAdults, String numberOfChildren, String stopovers, String currency, String priceFrom, String priceTo, String cabin, String weekdaysOnly, String weekendsOnly);

    List<FlightDTO> getReturnFlights(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String arriveDateFrom, String arriveDateTo);

    List<FlightDTO> getReturnFlightsFiltered(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String returnDateFrom, String returnDateTo, String numberOfAdults, String numberOfChildren, String stopovers, String currency, String priceFrom, String priceTo, String cabin, String weekdaysOnly, String weekendsOnly);

}

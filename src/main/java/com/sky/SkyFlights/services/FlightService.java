package com.sky.SkyFlights.services;

import com.sky.SkyFlights.dtos.FlightDTO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FlightService {

    List<FlightDTO> getOneWayFlights(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo);

    List<FlightDTO> getOneWayFlightsFiltered(String flyFrom, String flyTo, String leaveDateFrom, String leaveDateTo, String numberOfAdults, String numberOfChildren, String stopovers, String currency, String priceFrom, String priceTo, String cabin, String weekdaysOnly, String weekendsOnly, String adultHandBag, String adultHoldBag);
}

package com.sky.SkyFlights.rest;

import com.sky.SkyFlights.dtos.FlightDTO;
import com.sky.SkyFlights.services.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/flights")
public class FlightController {

    private FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }


    private com.sky.SkyFlights.domain.APIQueryParams APIQueryParams;


    @GetMapping("/get/")
    public List<FlightDTO> getOneWayFlights(@RequestParam(value = "flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo) {

        return this.service.getOneWayFlights(flyFrom, flyTo, leaveDateFrom, leaveDateTo);
    }


    @GetMapping("/getFiltered/")
    public List<FlightDTO> getOneWayFlightsFiltered(@RequestParam(value = "flyFrom", required = true) String flyFrom, @RequestParam(value = "flyTo", required = true) String flyTo, @RequestParam(value = "leaveDateFrom", required = true) String leaveDateFrom, @RequestParam(value = "leaveDateTo", required = true) String leaveDateTo, @RequestParam(value = "numberOfAdults", required = true) String numberOfAdults, @RequestParam(value = "numberOfChildren", defaultValue = "0") String numberOfChildren, @RequestParam(value = "stopovers", defaultValue = "0") String stopovers, @RequestParam(value = "currency", defaultValue = "GBP") String currency, @RequestParam(value = "priceFrom", defaultValue = "0") String priceFrom, @RequestParam(value = "priceTo", defaultValue = "20000") String priceTo, @RequestParam(value = "cabin", defaultValue = "M") String cabin, @RequestParam(value = "weekdaysOnly", defaultValue = "false") String weekdaysOnly, @RequestParam(value = "weekendsOnly", defaultValue = "false") String weekendsOnly) {


        return this.service.getOneWayFlightsFiltered(flyFrom, flyTo, leaveDateFrom, leaveDateTo, numberOfAdults, numberOfChildren, stopovers, currency, priceFrom, priceTo, cabin, weekdaysOnly, weekendsOnly);
    }


    @GetMapping("/getReturn/")
    public List<FlightDTO> getReturnFlights(@RequestParam(value = "flyFrom") String flyFrom, @RequestParam("flyTo") String flyTo, @RequestParam("leaveDateFrom") String leaveDateFrom, @RequestParam("leaveDateTo") String leaveDateTo, @RequestParam("returnDateFrom") String returnDateFrom, @RequestParam("returnDateTo") String returnDateTo) {

        return this.service.getReturnFlights(flyFrom, flyTo, leaveDateFrom, leaveDateTo, returnDateFrom, returnDateTo);
    }

    @GetMapping("/getReturnFiltered/")
    public List<FlightDTO> getReturnFlightsFiltered(@RequestParam(value = "flyFrom", required = true) String flyFrom, @RequestParam(value = "flyTo", required = true) String flyTo, @RequestParam(value = "leaveDateFrom", required = true) String leaveDateFrom, @RequestParam(value = "leaveDateTo", required = true) String leaveDateTo, @RequestParam("returnDateFrom") String returnDateFrom, @RequestParam("returnDateTo") String returnDateTo, @RequestParam(value = "numberOfAdults", required = true) String numberOfAdults, @RequestParam(value = "numberOfChildren", defaultValue = "0") String numberOfChildren, @RequestParam(value = "stopovers", defaultValue = "0") String stopovers, @RequestParam(value = "currency", defaultValue = "GBP") String currency, @RequestParam(value = "priceFrom", defaultValue = "0") String priceFrom, @RequestParam(value = "priceTo", defaultValue = "20000") String priceTo, @RequestParam(value = "cabin", defaultValue = "M") String cabin, @RequestParam(value = "weekdaysOnly", defaultValue = "false") String weekdaysOnly, @RequestParam(value = "weekendsOnly", defaultValue = "false") String weekendsOnly) {

        return this.service.getReturnFlightsFiltered(flyFrom, flyTo, leaveDateFrom, leaveDateTo, returnDateFrom, returnDateTo, numberOfAdults, numberOfChildren, stopovers, currency, priceFrom, priceTo, cabin, weekdaysOnly, weekendsOnly);
    }


}

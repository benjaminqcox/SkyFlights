package com.sky.SkyFlights.dtos;

import com.sky.SkyFlights.domain.FlightSearchAPI.Duration;
import com.sky.SkyFlights.domain.FlightSearchAPI.Fare;

import java.util.List;

public class FlightDTO {


     String local_departure;

     String local_arrival;

     String flyFrom;

     String flyTo;

     String duration;

     String fare;

     List<String> airlines;

     String departureTime;

     String arrivalTime;



    public FlightDTO(String localDeparture, String localArrival, String flyFrom, String flyTo, Duration duration, Fare fare, List<String> airlines) {
    }


    public FlightDTO(String local_departure, String local_arrival, String flyFrom, String flyTo, String duration, String fare, List<String> airlines, String departureTime, String arrivalTime) {
        this.local_departure = local_departure;
        this.local_arrival = local_arrival;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.duration = duration;
        this.fare = fare;
        this.airlines = airlines;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public FlightDTO(String local_departure, String local_arrival, String flyFrom, String flyTo, String duration, String fare, List<String> airlines) {
        this.local_departure = local_departure;
        this.local_arrival = local_arrival;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.duration = duration;
        this.fare = fare;
        this.airlines = airlines;
    }

    public String getLocal_departure() {
        return local_departure;
    }

    public void setLocal_departure(String local_departure) {
        this.local_departure = local_departure;
    }

    public String getLocal_arrival() {
        return local_arrival;
    }

    public void setLocal_arrival(String local_arrival) {
        this.local_arrival = local_arrival;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public List<String> getAirline() {
        return airlines;
    }

    public void setAirline(List<String> airlines) {
        this.airlines = airlines;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "FlightDTO{" +
                "local_departure='" + local_departure + '\'' +
                ", local_arrival='" + local_arrival + '\'' +
                ", flyFrom='" + flyFrom + '\'' +
                ", flyTo='" + flyTo + '\'' +
                ", duration='" + duration + '\'' +
                ", fare='" + fare + '\'' +
                ", airlines=" + airlines +
                '}';
    }
}

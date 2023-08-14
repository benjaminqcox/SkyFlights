package com.sky.SkyFlights.dtos;

import com.sky.SkyFlights.domain.FlightSearchAPI.Duration;
import com.sky.SkyFlights.domain.FlightSearchAPI.Fare;

import java.util.List;

// class for only the relevant information for displaying a flight on the front end
public class FlightDTO {


     String local_departure;

     String local_arrival;

     String cityFrom;

     String flyFrom;

     String cityTo;

     String flyTo;

     Long duration;

     Fare fare;

     List<String> airlines;





    public FlightDTO() {
    }

    public FlightDTO(String local_departure, String local_arrival, String flyFrom, String flyTo, Long duration, Fare fare, List<String> airlines, String cityFrom, String cityTo) {
        this.local_departure = local_departure;
        this.local_arrival = local_arrival;
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.duration = duration;
        this.fare = fare;
        this.airlines = airlines;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public List<String> getAirline() {
        return airlines;
    }

    public void setAirline(List<String> airlines) {
        this.airlines = airlines;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
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

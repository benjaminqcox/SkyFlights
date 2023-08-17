package com.sky.SkyFlights.dtos;

import com.sky.SkyFlights.domain.FlightSearchAPI.Fare;
import com.sky.SkyFlights.domain.FlightSearchAPI.Route;

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

     Object availability;

     List<Route> routes;




    public FlightDTO() {
    }

    public FlightDTO(String local_departure, String local_arrival, String cityFrom, String flyFrom, String cityTo, String flyTo, Long duration, Fare fare, List<String> airlines, Long availability, List<Route> routes) {
        this.local_departure = local_departure;
        this.local_arrival = local_arrival;
        this.cityFrom = cityFrom;
        this.flyFrom = flyFrom;
        this.cityTo = cityTo;
        this.flyTo = flyTo;
        this.duration = duration;
        this.fare = fare;
        this.airlines = airlines;
        this.availability = availability;
        this.routes = routes;
    }

    public FlightDTO(FlightDTOBuilder builder) {
        this.local_departure = builder.local_departure;
        this.local_arrival = builder.local_arrival;
        this.cityFrom = builder.cityFrom;
        this.flyFrom = builder.flyFrom;
        this.cityTo = builder.cityTo;
        this.flyTo = builder.flyTo;
        this.duration = builder.duration;
        this.fare = builder.fare;
        this.airlines = builder.airlines;
        this.availability = builder.availability;
        this.routes = builder.routes;
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

    public List<String> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<String> airlines) {
        this.airlines = airlines;
    }

    public Object getAvailability() {
        return availability;
    }

    public void setAvailability(Object availability) {
        this.availability = availability;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
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

    //builder pattern allows for DTOs to be made without every parameter (such as availability, which the api doesn't always return) and to clean up service code
    public static class FlightDTOBuilder{

        String local_departure;

        String local_arrival;

        String cityFrom;

        String flyFrom;

        String cityTo;

        String flyTo;

        Long duration;

        Fare fare;

        List<String> airlines;

        Object availability;

        List<Route> routes;


        public FlightDTOBuilder setLocalDeparture(String local_departure) {
            this.local_departure = local_departure;
            return this;
        }
        public FlightDTOBuilder setLocalArrival(String local_arrival) {
            this.local_arrival = local_arrival;
            return this;
        }
        public FlightDTOBuilder setCityFrom(String cityFrom) {
            this.cityFrom = cityFrom;
            return this;
        }

        public FlightDTOBuilder setFlyFrom(String flyFrom) {
            this.flyFrom = flyFrom;
            return this;
        }

        public FlightDTOBuilder setCityTo(String cityTo) {
            this.cityTo = cityTo;
            return this;
        }

        public FlightDTOBuilder setFlyTo(String flyTo) {
            this.flyTo = flyTo;
            return this;
        }

        public FlightDTOBuilder setDuration(Long duration) {
            this.duration = duration;
            return this;
        }

        public FlightDTOBuilder setFare(Fare fare) {
            this.fare = fare;
            return this;
        }

        public FlightDTOBuilder setAirlines(List<String> airlines) {
            this.airlines = airlines;
            return this;
        }

        public FlightDTOBuilder setAvailability(Object availability) {
            this.availability = availability;
            return this;
        }

        public FlightDTOBuilder setRoutes(List<Route> routes) {
            this.routes = routes;
            return this;
        }


        public FlightDTO build() {
            return new FlightDTO(this);
        }
    }
}

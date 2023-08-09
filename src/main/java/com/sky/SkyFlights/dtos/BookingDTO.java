package com.sky.SkyFlights.dtos;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class BookingDTO {

    @Id
    @GeneratedValue
    private Integer id;

    private Date dateOfBooking;

    private FlightDTO flightInfo;

    private WeatherDTO weather;

    public BookingDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public FlightDTO getFlightInfo() {
        return flightInfo;
    }

    public void setFlightInfo(FlightDTO flightInfo) {
        this.flightInfo = flightInfo;
    }

    public WeatherDTO getWeather() {
        return weather;
    }

    public void setWeather(WeatherDTO weather) {
        this.weather = weather;
    }
}

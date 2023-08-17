package com.sky.SkyFlights.dtos;


import com.sky.SkyFlights.domain.Booking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDisplayDTO {

    public int bookingID;
    public int flightID;
    public String flightFrom;
    public String flightTo;
    public String cityFrom;
    public String cityTo;
    public int adults;
    public int children;
    public String cabinType;
    public int stopovers;
    public Date dateFrom;
    public Date dateTo;
    public Boolean returnOrNot;
    private Integer userID;

    public BookingDisplayDTO(Booking b) {
        this.bookingID = b.getBookingID();
        this.flightID=b.getFlightID();
        this.flightFrom=b.getFlightFrom();
        this.flightTo=b.getFlightTo();
        this.cityFrom=b.getCityFrom();
        this.cityTo=b.getCityTo();
        this.adults=b.getAdults();
        this.children=b.getChildren();
        this.cabinType=b.getCabinType();
        this.stopovers=b.getStopovers();
        this.dateFrom=b.getDateFrom();
        this.dateTo=b.getDateTo();
        this.returnOrNot=b.returnOrNot;
        this.userID=b.getUser().userID;
    }
}



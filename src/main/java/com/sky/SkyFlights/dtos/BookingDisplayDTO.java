package com.sky.SkyFlights.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sky.SkyFlights.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

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
    public User userID;

}

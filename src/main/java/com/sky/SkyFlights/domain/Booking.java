package com.sky.SkyFlights.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int bookingID;
    public String userID;

    public String flightID;

    public Booking() {
    }

    public Booking(String flightID) {
        this.flightID = flightID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }
}

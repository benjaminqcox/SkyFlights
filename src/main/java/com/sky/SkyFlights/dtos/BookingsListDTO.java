package com.sky.SkyFlights.dtos;



import com.sky.SkyFlights.domain.Booking;

import java.util.List;


public class BookingsListDTO {

    public int userID;
    public String userName;
    public List<Booking> bookings;

    public BookingsListDTO(int userID, String userName, List<Booking> bookings) {
        this.userID = userID;
        this.userName = userName;
        this.bookings = bookings;
    }

    public BookingsListDTO() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}


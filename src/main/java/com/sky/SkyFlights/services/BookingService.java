package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.Booking;

import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    Booking createBooking(Booking booking);

    Booking getBookingByUserId(int userID);

    Booking getBookingByUsername(String username);
}

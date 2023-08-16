package com.sky.SkyFlights.services;

//import com.sky.SkyFlights.domain.Location;
import com.sky.SkyFlights.domain.Booking;
import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.repos.BookingRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    Booking createBooking(Booking booking);

    Booking getBookingByUserId(int userID);
}

//    public Location get(int id);

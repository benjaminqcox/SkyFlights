package com.sky.SkyFlights.services;

import com.sky.SkyFlights.domain.Booking;
import com.sky.SkyFlights.repos.BookingRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookingserviceDB implements BookingService{

    public BookingRepo bookingRepo;
    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    @Override
    public Booking getBookingByUserId(int userID) {
        return bookingRepo.getBookingByUserId(userID);
    }

    @Override
    public void deleteBookingByBookingId(int bookingID) {
        bookingRepo.deleteById(bookingID);
    }

}

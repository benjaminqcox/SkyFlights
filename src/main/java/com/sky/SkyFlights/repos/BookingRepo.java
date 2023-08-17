package com.sky.SkyFlights.repos;

import com.sky.SkyFlights.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
    @Query(value = "SELECT * FROM flight_booking.users u join flight_booking.booking b on b.user_userid = u.userid where u.userid=:userID",nativeQuery = true)
    Booking getBookingByUserId(int userID);
}

package com.sky.SkyFlights.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDTO {

    public int userID;
    public String email;
    public String userName;
    public String firstName;
    public String lastName;
    public List<BookingDisplayDTO> bookings;
}


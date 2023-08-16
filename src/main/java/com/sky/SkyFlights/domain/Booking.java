package com.sky.SkyFlights.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public Date dateFrom;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public Date dateTo;
    public Boolean returnOrNot;

    @ManyToOne(targetEntity = User.class)
    @JsonBackReference
    public User user;

}

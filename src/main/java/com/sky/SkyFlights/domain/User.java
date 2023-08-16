package com.sky.SkyFlights.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = {"email","username"}))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int userID;

    @Column(nullable = false)
    public String firstName;

    @Column(nullable = false)
    public String lastName;

    @Column(nullable = false)
    public String userName;

    @Column(nullable = false, unique = true)
    public String email;

    @Column(nullable = false)
    public String password;


    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    public List<Booking> booking;

}

package com.sky.SkyFlights.domain;

public class Location {

    public int id;

    public Location(int id) {
        this.id = id;
    }

    public Location() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                '}';
    }
}

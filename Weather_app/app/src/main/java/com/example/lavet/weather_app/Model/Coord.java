package com.example.lavet.weather_app.Model;

/**
 * Created by lavet on 4/24/17.
 */

public class Coord {
    private double lon;
    private double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Coord(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }
}

package com.example.lavet.weather_app.Model;

/**
 * Created by lavet on 4/24/17.
 */

public class Sys {
    private int id;
    private int type;
    private String country;
    private  double message;
    private  double sunrise;
    private  double sunset;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(double sunrise) {
        this.sunrise = sunrise;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(double sunset) {
        this.sunset = sunset;
    }

    public Sys(int id, int type, String country, double message, double sunrise, double sunset) {
        this.id = id;
        this.type = type;
        this.country = country;
        this.message = message;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
}

package com.example.lavet.weather_app.Model;

/**
 * Created by lavet on 4/24/17.
 */

public class Wind {
    private double speed;
    private double deg;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public Wind(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }
}

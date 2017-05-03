package com.example.lavet.weather_app.Model;

/**
 * Created by lavet on 4/24/17.
 */

public class Main {
    private double temp;
    private int humidity;
    private double pressure;
    private double min_temp;
    private double max_temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(double min_temp) {
        this.min_temp = min_temp;
    }

    public double getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(double max_temp) {
        this.max_temp = max_temp;
    }

    public Main(double temp, int humidity, double pressure, double min_temp, double max_temp) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
    }
}

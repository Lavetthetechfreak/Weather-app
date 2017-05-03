package com.example.lavet.weather_app.Model;

import java.util.List;

/**
 * Created by lavet on 4/24/17.
 */

public class OpenWeatherMap {
    private Coord coord;
    private List<Weather> WeatherList;
    private String base;
    private Main main;
    private Cloud cloud;
    private  Rain rain;
    private Sys sys;
    private Wind wind;
    private int id;
    private int dt;
    private String name;
    private int cod;

   public  OpenWeatherMap(){
       this.coord = coord;
       this.WeatherList = WeatherList;
       this.base = base;
       this.main = main;
       this.cloud = cloud;
       this.rain = rain;
       this.sys = sys;
       this.wind = wind;
       this.id = id;
       this.dt = dt;
       this.name = name;

       this.cod = cod;
   }


    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeatherList() {
        return WeatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        WeatherList = weatherList;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}

package com.example.lavet.weather_app.Model;

/**
 * Created by lavet on 4/24/17.
 */

public class Weather {
    private int id;
    private String Description;
    private String main;
    private String icon;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getDescription() {

        return Description;
    }

    public void setDescription(String description) {

        Description = description;
    }

    public String getMain() {

        return main;
    }

    public void setMain(String main) {

        this.main = main;
    }

    public String getIcon() {

        return icon;
    }

    public void setIcon(String icon) {

        this.icon = icon;
    }

    public Weather(int id, String description, String main, String icon) {
        this.id = id;

        Description = description;
        this.main = main;
        this.icon = icon;
    }
}

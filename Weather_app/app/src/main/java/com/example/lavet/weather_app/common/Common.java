package com.example.lavet.weather_app.common;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

import java.util.Date;

/**
 * Created by lavet on 4/24/17.
 */

public class Common {
    public static String API_KEY = "C1c3d19e861dde5e67c2638e4f68d41f";
    public  static String API_LINK = "https://api.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat-%s&long-%s&APPID-%s%unit-metric",lat,lng,API_KEY));
        return sb.toString();
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String unixTimeStampToDateTime(double unixtimestamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixtimestamp*1000);
        return dateFormat.format(date);
    }
    public static String getImages(String icon){
        return String.format("https://openweathermap.org/images/w/%s.png",icon);

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String getDatenow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}

package com.example.lavet.weather_app.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lavet on 4/24/17.
 */

public class Helper {
    public static String stream = null;

    public Helper(){

    }
    public static String getHttpData(String urlstring){
        try {
            URL url = new URL(urlstring);
            HttpURLConnection httpURLConnection =(HttpURLConnection)url.openConnection();
            if (httpURLConnection.getResponseCode()==200)// 200 means 0k
            {
                BufferedReader r = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine())!=null);
                sb.append(line);
                stream = sb.toString();
                httpURLConnection.disconnect();

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }
}

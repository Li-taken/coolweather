package com.coolweather.android.gson;

/**
 * Created by ts on 19-7-23.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

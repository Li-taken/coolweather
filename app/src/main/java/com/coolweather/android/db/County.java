package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ts on 19-7-22.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;  // 记录县的名字
    private String weatherId;  // 记录县所对应的天气id
    private int cityId; // 记录当前县所属市的id

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

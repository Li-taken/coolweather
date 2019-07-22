package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ts on 19-7-22.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;  // 记录市的名字
    private int cityCode;   // 记录市的代号
    private int ProvinceId;  // 记录当前市所属省的id值

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }
}

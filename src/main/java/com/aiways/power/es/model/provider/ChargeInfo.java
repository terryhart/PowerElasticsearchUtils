package com.aiways.power.es.model.provider;

/**
 * Created by Chris Chen
 * 2018/11/22
 * Explain:
 */

public class ChargeInfo {
    private String name;//充电桩名称
    private Double lng;//经度
    private Double lat;//纬度

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
}

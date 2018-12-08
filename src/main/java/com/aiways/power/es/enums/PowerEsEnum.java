package com.aiways.power.es.enums;

import com.aiways.power.es.consts.EsIndexType;
import com.aiways.power.es.model.provider.BatteryInfo;
import com.aiways.power.es.model.provider.ChargeInfo;
import com.aiways.power.es.model.provider.VehicleInfo;

/**
 * Created by Chris Chen
 * 2018/11/22
 * Explain: ElasticSearch数据库表名称 枚举
 */

public enum PowerEsEnum {
    VEHICLE_INFO(EsIndexType.VEHICLE_INFO, EsIndexType.VEHICLE_INFO, "车辆", VehicleInfo.class.getName()),
    BATTERY_INFO(EsIndexType.BATTERY_INFO, EsIndexType.VEHICLE_INFO, "电池包", BatteryInfo.class.getName()),
    CHARGE_INFO("charge_info", "charge_info", "充电桩", ChargeInfo.class.getName());

    private String index;
    private String type;
    private String info;
    private String dataClassName;

    PowerEsEnum(String index, String type, String info, String dataClassName) {
        this.index = index;
        this.type = type;
        this.info = info;
        this.dataClassName = dataClassName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDataClassName() {
        return dataClassName;
    }

    public void setDataClassName(String dataClassName) {
        this.dataClassName = dataClassName;
    }

    public static PowerEsEnum getByIndex(String index) {
        if (index == null || "".equals(index.trim())) {
            return null;
        }
        PowerEsEnum[] values = values();
        for (PowerEsEnum value : values) {
            if (index.equals(value.getIndex())) {
                return value;
            }
        }
        return null;
    }

    public static PowerEsEnum getByTypex(String type) {
        if (type == null || "".equals(type.trim())) {
            return null;
        }
        PowerEsEnum[] values = values();
        for (PowerEsEnum value : values) {
            if (type.equals(value.getType())) {
                return value;
            }
        }
        return null;
    }

    public static PowerEsEnum getByClassName(String className) {
        if (className == null || "".equals(className.trim())) {
            return null;
        }
        PowerEsEnum[] values = values();
        for (PowerEsEnum value : values) {
            if (className.equals(value.getDataClassName())) {
                return value;
            }
        }
        return null;
    }

    public static PowerEsEnum get(Class<?> clazz) {
        return getByClassName(clazz.getName());
    }
}

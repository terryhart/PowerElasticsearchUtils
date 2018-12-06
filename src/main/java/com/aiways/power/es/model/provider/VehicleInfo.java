package com.aiways.power.es.model.provider;

/**
 * Created by Chris Chen
 * 2018/11/22
 * Explain: 车辆信息
 */

public class VehicleInfo {
    private transient String id;
    private String tenantId;
    private String vin;
    private String model;

    public VehicleInfo() {
    }

    public VehicleInfo(String tenantId, String vin, String model) {
        this.tenantId = tenantId;
        this.vin = vin;
        this.model = model;
    }

    public static VehicleInfo create(String tenantId, String vin, String model) {
        return new VehicleInfo(tenantId, vin, model);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

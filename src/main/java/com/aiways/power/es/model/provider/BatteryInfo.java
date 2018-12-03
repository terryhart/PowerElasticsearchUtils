package com.aiways.power.es.model.provider;

import java.util.List;

/**
 * Created by Chris Chen
 * 2018/11/22
 * Explain: 电池信息
 */

public class BatteryInfo {
    private String tenantId;//租户ID
    private String vin;//车辆vin
    private String batteryPackCode;//电池包编码
    private Double realCapacity;//实际容量
    private Double capacity;//额定容量
    private String PackModel;//电池包型号
    private String VehicleModel;//车辆型号
    private String enterprise;//电池包生产厂家
    private List<Module> moduleList;//模块集合

    public BatteryInfo() {
    }

    public BatteryInfo(String tenantId, String vin, String batteryPackCode, Double realCapacity, Double capacity, String packModel, String vehicleModel, String enterprise) {
        this.tenantId = tenantId;
        this.vin = vin;
        this.batteryPackCode = batteryPackCode;
        this.realCapacity = realCapacity;
        this.capacity = capacity;
        this.PackModel = packModel;
        this.VehicleModel = vehicleModel;
        this.enterprise = enterprise;
    }

    public static BatteryInfo create(String tenantId, String vin, String batteryPackCode, Double realCapacity, Double capacity, String packModel, String vehicleModel, String enterprise) {
        return new BatteryInfo(tenantId, vin, batteryPackCode, realCapacity, capacity, packModel, vehicleModel, enterprise);
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

    public String getBatteryPackCode() {
        return batteryPackCode;
    }

    public void setBatteryPackCode(String batteryPackCode) {
        this.batteryPackCode = batteryPackCode;
    }

    public Double getRealCapacity() {
        return realCapacity;
    }

    public void setRealCapacity(Double realCapacity) {
        this.realCapacity = realCapacity;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getPackModel() {
        return PackModel;
    }

    public void setPackModel(String packModel) {
        PackModel = packModel;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    //模块
    static class Module {
        private String code;//模块编码
        private int position;//模块位置
        private List<SingleBattery> singleBatteryList;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public List<SingleBattery> getSingleBatteryList() {
            return singleBatteryList;
        }

        public void setSingleBatteryList(List<SingleBattery> singleBatteryList) {
            this.singleBatteryList = singleBatteryList;
        }

        //单体电池
        static class SingleBattery {
            private int position;//位置号

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }
        }
    }
}

package com.aiways.power.es.model;

import java.util.List;

/**
 * Created by Chris Chen
 * 2018/11/22
 * Explain: 电池信息
 */

public class BatteryInfo {
    private String batteryPackCode;//电池包编码
    private Integer capacity;//额定容量
    private List<Module> moduleList;//模块集合

    public String getBatteryPackCode() {
        return batteryPackCode;
    }

    public void setBatteryPackCode(String batteryPackCode) {
        this.batteryPackCode = batteryPackCode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
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

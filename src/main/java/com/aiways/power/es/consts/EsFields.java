package com.aiways.power.es.consts;

/**
 * Created by Chris Chen
 * 2018/12/05
 * Explain: ElasticSearch查询用到的key
 */

public interface EsFields {
    //region 通用 各库表使用的相同字段
    String TENANT_ID="tenantId.keyword";//租户ID
    String VIN="vin.keyword";//车辆VN
    String BATTERY_PACK_CODE="batteryPackCode.keyword";//电池包编码
    //endregion

    //region 车辆信息表 vehicle_info
    String VEHICLE_MODEL="model.keyword";//车辆型号
    //endregion
    //region 电池包信息表 battery_info
    String BATTERY_INFO_VEHICLE_MODEL_="VehicleModel.keyword";//车辆型号
    String BATTERY_INFO_PACK_MODEL_="PackModel.keyword";//电池型号型号
    String BATTERY_INFO_ENTERPRISE_="enterprise.keyword";//电池生产厂家
    //endregion
}

package com.aiways.power.es.consts;

/**
 * Created by Chris Chen
 * 2018/12/05
 * Explain: ElasticSearch查询用到的key
 */

public interface EsIndexType {
    //region 实时监控数据 vehicle
    String VEHICLE = "vehicle";
    //endregion

    //region 实时监控最新数据 vehicle_latest
    String VEHICLE_LATEST = "vehicle_latest";
    //endregion

    //region 实时监控前一天最后一条数据 vehicle_lastday
    String VEHICLE_LASTDAY = "vehicle_lastday";
    //endregion

    //region 实时监控故障统计 fault_count
    String FAULT_COUNT = "fault_count";
    //endregion

    //region 字典缓存数据 dict_cache
    String DICT_CACHE = "dict_cache";
    //endregion

    //region 车辆信息同步数据 vehicle_info
    String VEHICLE_INFO = "vehicle_info";
    //endregion

    //region 电池信息同步数据 battery_info
    String BATTERY_INFO = "battery_info";
    //endregion


}

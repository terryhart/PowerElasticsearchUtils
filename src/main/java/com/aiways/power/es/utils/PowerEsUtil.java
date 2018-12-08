package com.aiways.power.es.utils;

import com.aiways.power.es.enums.PowerEsEnum;
import com.chris.es.jest.model.EsSearchParams;
import com.chris.es.jest.model.PageData;
import com.chris.es.jest.utils.ESUtils;
import com.chris.es.jest.utils.JestUtil;
import io.searchbox.client.JestClient;
import io.searchbox.core.SearchResult;

import java.io.IOException;
import java.util.List;

/**
 * Created by Chris Chen
 * 2018/11/22
 * Explain: 爱驰能源项目 ES便捷处理工具
 */

public class PowerEsUtil {
    private static JestClient jestClient = null;

    /**
     * 初始化
     * 提供jestClient
     *
     * @param jestClient
     */
    public static void init(JestClient jestClient) {
        PowerEsUtil.jestClient = jestClient;
        JestUtil.init(jestClient);
    }

    /**
     * 静态创建
     * 提供jestClient
     *
     * @param serverUri
     * @param timeout
     */
    public static void createJestClient(String serverUri, int timeout) {
        JestClient jestClient = JestUtil.createJestClient(serverUri, timeout);
        init(jestClient);
    }

    /**
     * 保存一个对象
     *
     * @param data
     * @param <T>
     * @throws IOException
     */
    public static <T> void save(T data) throws IOException {
        Class<?> dataClass = data.getClass();
        PowerEsEnum powerEsEnum = PowerEsEnum.get(dataClass);
        JestUtil.save(data, powerEsEnum.getIndex(), powerEsEnum.getType());
    }

    /**
     * 更新一个对象
     * 该对象中一定要有一个真实的id，取自于_id
     *
     * @param data
     * @param <T>
     * @throws IOException
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static <T> void update(T data, String id) throws IOException {
        Class<?> dataClass = data.getClass();
        PowerEsEnum powerEsEnum = PowerEsEnum.get(dataClass);
        JestUtil.update(data, powerEsEnum.getIndex(), powerEsEnum.getType(), id);
    }

    /**
     * 批量保存
     *
     * @param dataList
     * @param <T>
     * @throws IOException
     */
    public static <T> void saveAll(List<T> dataList) throws IOException {
        if (dataList != null && dataList.size() > 0) {
            T data = dataList.get(0);
            Class<?> dataClass = data.getClass();
            PowerEsEnum powerEsEnum = PowerEsEnum.get(dataClass);
            JestUtil.saveAll(dataList, powerEsEnum.getIndex(), powerEsEnum.getType());
        }
    }

    /**
     * 获取所有
     * 实际上只能取到前10条
     *
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> List<T> findAll(Class<T> clazz) throws IOException {
        PowerEsEnum powerEsEnum = PowerEsEnum.get(clazz);
        return JestUtil.findAll(clazz, powerEsEnum.getIndex(), powerEsEnum.getType());
    }

    /**
     * 根据条件配到第一条数据
     * 可以自己取id和对象
     * 主要用作更新
     *
     * @param params
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> SearchResult.Hit<T, ?> findOne(EsSearchParams params, Class<T> clazz) {
        return ESUtils.findOne(PowerEsUtil.jestClient, params, clazz);
    }

    /**
     * 条件搜索并且构建为分页数据
     *
     * @param params
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> PageData<T> searchPage(EsSearchParams params, Class<T> clazz) {
        return ESUtils.searchPage(PowerEsUtil.jestClient, params, clazz);
    }

    /**
     * 搜索列表数据
     *
     * @param params
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> searchList(EsSearchParams params, Class<T> clazz) {
        return ESUtils.searchList(PowerEsUtil.jestClient, params, clazz);
    }

    /**
     * 搜索结果
     *
     * @param params
     * @return
     */
    public static SearchResult searchResult(EsSearchParams params) {
        return ESUtils.searchResult(PowerEsUtil.jestClient, params);
    }


}

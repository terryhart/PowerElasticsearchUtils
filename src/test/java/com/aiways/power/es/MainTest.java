package com.aiways.power.es;

import com.chris.es.jest.model.EsSearchParams;
import com.chris.es.jest.model.PageData;
import com.chris.es.jest.utils.ESUtils;
import com.chris.es.jest.utils.LoggerUtils;
import com.google.gson.Gson;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.SearchResult;

import java.io.IOException;

/**
 * Created by Chris Chen
 * 2018/11/07
 * Explain:
 */

public class MainTest {
    public static void main(String[] args) throws IOException {
        test1();
    }

    private static void test1() throws IOException {
        String serverUri = "http://10.100.81.151:9200";
        JestClientFactory jestClientFactory = new JestClientFactory();
        HttpClientConfig config = new HttpClientConfig.Builder(serverUri)
                .connTimeout(1000 * 10)
                .build();
        jestClientFactory.setHttpClientConfig(config);
        JestClient jestClient = jestClientFactory.getObject();

        EsSearchParams esSearchParams = EsSearchParams.get()
                .setIndexAndType("fault_count", "fault_count")
                .setPageParams(0, 10000)
                .addFieldKV("tenantId.keyword", "0")
                .setSort("latestTime",false);

        PageData<Object> faultCountPageData = ESUtils.searchPage(jestClient, esSearchParams, Object.class);
        LoggerUtils.prnln(faultCountPageData.getTotal());
        LoggerUtils.prnln(new Gson().toJson(faultCountPageData));
    }
}

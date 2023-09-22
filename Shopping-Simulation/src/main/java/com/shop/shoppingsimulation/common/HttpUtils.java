package com.shop.shoppingsimulation.common;

import com.alibaba.fastjson.JSONObject;
import com.shop.model.api.CommonResult;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class HttpUtils {

    private static String token = "";
    private static final int SOCKET_TIME_OUT = 60000;
    private static final int CONNECT_TIME_OUT = 60000;
    private static final String BASIC_URL = "http://localhost:8401/";
    private static final int RETRY_COUNT = 3;

    public static <T extends Object> T HttpGet(String Url, Class<T> clazz)  {
        return HttpGet(Url, clazz, 0);
    }

    public static <T extends Object> T HttpPost(String Url, Map<String, String> params, Class<T> clazz)  {
        return HttpPost(Url, params, clazz, 0);
    }

    private static <T extends Object> T HttpGet(String Url, Class<T> clazz, Integer RetryCount)  {
        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet httpGet = new HttpGet(BASIC_URL + Url);
            httpGet.addHeader("Authorization", "Bearer " + token);
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(SOCKET_TIME_OUT).setConnectionRequestTimeout(CONNECT_TIME_OUT).build();
            httpGet.setConfig(requestConfig);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String httpResult = EntityUtils.toString(entity);
            // 打印响应内容长度
            System.out.println("Response content length: " + entity.getContentLength());
            // 打印响应内容
            System.out.println("Response content: " + httpResult);
            CommonResult<T> result = JSONObject.parseObject(httpResult, CommonResult.class);
            if (result.getCode() == 200) {
                return result.getData();
            } else if (RetryCount < RETRY_COUNT) {
                if (result.getCode() == 401) {
                    GetToken();
                    return HttpGet(Url, clazz, RetryCount + 1);
                } else {
                    return HttpGet(Url, clazz, RetryCount + 1);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static <T extends Object> T HttpPost(String Url, Map<String, String> params, Class<T> clazz, Integer RetryCount) {
        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost(BASIC_URL + Url);
            httpPost.addHeader("Authorization", "Bearer " + token);
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(SOCKET_TIME_OUT).setConnectionRequestTimeout(CONNECT_TIME_OUT).build();
            httpPost.setConfig(requestConfig);
            JSONObject jsonObject = new JSONObject();
            params.forEach((key, value) -> {
                jsonObject.put(key, value);
            });
            httpPost.setEntity(new StringEntity(jsonObject.toString(), "UTF-8"));
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            String httpResult = EntityUtils.toString(entity);
            // 打印响应内容长度
            System.out.println("Response content length: " + entity.getContentLength());
            // 打印响应内容
            System.out.println("Response content: " + httpResult);
            CommonResult<T> result = JSONObject.parseObject(httpResult, CommonResult.class);
            if (result.getCode() == 200) {
                return result.getData();
            } else if (RetryCount < RETRY_COUNT) {
                if (result.getCode() == 401) {
                    GetToken();
                    return HttpPost(Url, params, clazz, RetryCount + 1);
                } else {
                    return HttpPost(Url, params, clazz, RetryCount + 1);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static void GetToken() throws Exception {
        token = HttpPost("shop-portal/sso/login?username=test&password=123456", new HashMap<>(), String.class);
    }
}

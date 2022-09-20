package com.tencent.wxcloudrun.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
@Slf4j
public class OpenIdService {

    public String openId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        url += "?appid=wxa1a9699b688aa690";//自己的appid
        url += "&secret=fbf1b945498d0e8e7b96f2834f61e2f7";//自己的appSecret
        url += "&js_code=" + code;
        url += "&grant_type=authorization_code";
        url += "&connect_redirect=1";
        String res = null;

        // DefaultHttpClient();
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpget = new HttpGet(url);    //GET方式
        CloseableHttpResponse response = null;
        try {
            // 配置信息
            RequestConfig requestConfig = RequestConfig.custom()          // 设置连接超时时间(单位毫秒)
                    .setConnectTimeout(5000)                    // 设置请求超时时间(单位毫秒)
                    .setConnectionRequestTimeout(5000)             // socket读写超时时间(单位毫秒)
                    .setSocketTimeout(5000)                    // 设置是否允许重定向(默认为true)
                    .setRedirectsEnabled(false).build();           // 将上面的配置信息 运用到这个Get请求里
            httpget.setConfig(requestConfig);                         // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpget);                   // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                res = EntityUtils.toString(responseEntity);
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + res);
            }

            JSONObject jo = JSON.parseObject(res);
            return jo.getString("openid");
        } catch (Exception ex) {
            log.error("未能获取openid");
            return "";
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (Exception ex) {
                log.error("释放http-client失败");
            }
        }
    }
}

package com.ray.util;


import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
* Company:xhb
* Author:xhb
* Date: 2018/9/6
* Description:网络请求工具类
*/
public class HttpRequestUtil {

   /**
    * 若不需要传参，调用改方法请求
    *
    * @param requestUrl
    * @param requestMethod
    * @return
    */
/*    public static String httpRequest(String requestUrl, String requestMethod) {
       return httpRequest(requestUrl, requestMethod, null);
   }*/
	private static org.slf4j.Logger log = LoggerFactory.getLogger(HttpRequestUtil.class);   
	  
    /**  
     * 执行一个HTTP GET请求，返回请求响应的HTML  
     *  
     * @param url                 请求的URL地址  
     * @param queryString 请求的查询参数,可以为null   
     * @return 返回请求响应的HTML  
     */   
    public static JSONObject doGet(String url, String param) {   
    	CloseableHttpClient httpCilent2 = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)   //设置连接超时时间
                .setConnectionRequestTimeout(5000) // 设置请求超时时间
                .setSocketTimeout(5000)
                .setRedirectsEnabled(true)//默认允许自动重定向
                .build();
        HttpGet httpGet2 = new HttpGet(url+param);
        httpGet2.setConfig(requestConfig);
        String srtResult = "";
        JSONObject jsonObj = new JSONObject();
        try {
            HttpResponse httpResponse = httpCilent2.execute(httpGet2);
            if(httpResponse.getStatusLine().getStatusCode() == 200){
                srtResult = EntityUtils.toString(httpResponse.getEntity());//获得返回的结果
                System.out.println(srtResult);
                jsonObj = JSONObject.parseObject(srtResult);
            }else if(httpResponse.getStatusLine().getStatusCode() == 400){
                //..........
            }else if(httpResponse.getStatusLine().getStatusCode() == 500){
                //.............
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpCilent2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return jsonObj;
    }   

   /**
    * 调用url，返回数据
    *
    * @param requestUrl
    * @param requestMethod
    * @param outputStr
    * @return
    */
   public static String httpRequest(String requestUrl/*, String requestMethod, String outputStr*/) {
   	try {
           URL url = new URL(requestUrl);
           HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setUseCaches(false);
           // 设置请求方式（GET/POST）
           /*conn.setRequestMethod(requestMethod);*/
           conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
           // 当outputStr不为null时向输出流写数据
           /*if (null != outputStr) {
               OutputStream outputStream = conn.getOutputStream();
               // 注意编码格式
               outputStream.write(outputStr.getBytes("UTF-8"));
               outputStream.close();
           }*/
           // 从输入流读取返回内容
           InputStream inputStream = conn.getInputStream();
           InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
           BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
           String str = null;
           StringBuffer buffer = new StringBuffer();
           while ((str = bufferedReader.readLine()) != null) {
               buffer.append(str);
           }
           // 释放资源
           bufferedReader.close();
           inputStreamReader.close();
           inputStream.close();
           inputStream = null;
           conn.disconnect();
           return buffer.toString();
       } catch (ConnectException ce) {
           System.out.println("连接超时：{}");
       } catch (Exception e) {
//           System.out.println("https请求异常：{}");
       }
       return null;
   }
 
   /**
    * post 请求 服务
    * @param url 服务地址
    * @param parms map 数据 
    * @return
    */
   public static JSONObject postForForm(String url, Map<String, String> parms) {
		HttpPost httpPost = new HttpPost(url);
		ArrayList<BasicNameValuePair> list = new ArrayList<>();
		parms.forEach((key, value) -> list.add(new BasicNameValuePair(key, value)));
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			if (Objects.nonNull(parms) && parms.size() > 0) {
				httpPost.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
			}
			InputStream content = httpPost.getEntity().getContent();
			InputStreamReader inputStreamReader = new InputStreamReader(content, "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String readLine = bufferedReader.readLine();
			System.out.println("readLine===================================" + readLine);
			HttpResponse response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			JSONObject jsonObject = JSON.parseObject(EntityUtils.toString(entity, "UTF-8"));
			return jsonObject;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(httpClient)) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
   
   	public static void getForForm(String getUrl) {
   		CloseableHttpClient httpClient = HttpClients.createDefault();  
        CloseableHttpResponse response = null;  
        InputStream is = null;  
        String url = getUrl;  
        //封装请求参数  
        List<NameValuePair> params = Lists.newArrayList();  
        params.add(new BasicNameValuePair("wx_user_id", "henan"));  
        String str = "";  
        try {  
            //转换为键值对  
            str = EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));  
            System.out.println(str);  
            //创建Get请求  
            HttpGet httpGet = new HttpGet(url+"?"+str);  
            //执行Get请求，  
            response = httpClient.execute(httpGet);  
            //得到响应体  
            HttpEntity entity = response.getEntity();  
            if(entity != null){  
                is = entity.getContent();  
                //转换为字节输入流  
                BufferedReader br = new BufferedReader(new InputStreamReader(is, Consts.UTF_8));  
                String body = null;  
                while((body=br.readLine()) != null){  
                    System.out.println("body:"+body);  
                }  
            }  
        } catch (ParseException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally{  
            //关闭输入流，释放资源  
            if(is != null){  
                try {  
                    is.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
            //消耗实体内容  
            if(response != null){  
                try {  
                    response.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
            //关闭相应 丢弃http连接  
            if(httpClient != null){  
                try {  
                    httpClient.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
          
   	}
   
	   
}


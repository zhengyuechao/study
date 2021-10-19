package com.study.common.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;

public class HttpUtil {

	//https://api.xiaohuwei.cn/test.php?type=province
	
	 //Http协议GET请求
    public static String httpGet(String url) throws Exception{
        //初始化HttpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建HttpGet
        HttpGet httpGet = new HttpGet(url);
        //发起请求，获取response对象
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //获取请求状态码
        //response.getStatusLine().getStatusCode();
        //获取返回数据实体对象
        HttpEntity entity = response.getEntity();
        //转为字符串
        String result = EntityUtils.toString(entity,"UTF-8");
        return result;

    }

    //Http协议Post请求
    public static String httpPost (String url,String json) throws Exception{
        //初始HttpClient
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建Post对象
        HttpPost httpPost = new HttpPost(url);
        //设置Content-Type
        httpPost.setHeader("Content-Type","application/json");
        //写入JSON数据
        httpPost.setEntity(new StringEntity(json));
        //发起请求，获取response对象
        CloseableHttpResponse response = httpClient.execute(httpPost);
        //获取请求码
        //response.getStatusLine().getStatusCode();
        //获取返回数据实体对象
        HttpEntity entity = response.getEntity();
        //转为字符串
        String result = EntityUtils.toString(entity,"UTF-8");
        return result;

    }
    
   

   //Https协议Get请求
   public static String httpsGet(String url) throws Exception{
       CloseableHttpClient hp = createSSLClientDefault();
       HttpGet hg = new HttpGet(url);
       CloseableHttpResponse response = hp.execute(hg);
       HttpEntity entity = response.getEntity();
       String content = EntityUtils.toString(entity,"UTF-8");
       hp.close();
       return content;
   }
   //Https协议Post请求
   public static String httpsPost(String url, String json) throws Exception{

        CloseableHttpClient hp = createSSLClientDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type","application/json");
        httpPost.setEntity(new StringEntity(json));
        CloseableHttpResponse response = hp.execute(httpPost);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity,"UTF-8");
        hp.close();
        return content;
   }

    
   public static CloseableHttpClient createSSLClientDefault() throws Exception{
   //如果下面的方法证书还是不过，报错的话试试下面第二种
       /* SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy(){
       //信任所有
       public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
       return true;
       }
       }).build();
       SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
       return HttpClients.custom().setSSLSocketFactory(sslsf).build();*/

       SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
              SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build(),
                 NoopHostnameVerifier.INSTANCE);
       return HttpClients.custom().setSSLSocketFactory(sslsf).build();

   }
   /**
    * 
    * post请求 参数加UTF-8 能将汉字提交的参数进行转发
    * @param url
    * @param json
    * @date 2021-05-13
    * @return
    */
   public static JSONObject doPost(String url,JSONObject json){

       CloseableHttpClient httpclient = HttpClientBuilder.create().build();
       HttpPost post = new HttpPost(url);
       JSONObject response = null;
       try {
           StringEntity s = new StringEntity(json.toString(), "UTF-8");
           s.setContentEncoding("UTF-8");
           s.setContentType("application/json");//发送json数据需要设置contentType
           post.setEntity(s);
           HttpResponse res = httpclient.execute(post);
           if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
               String result = EntityUtils.toString(res.getEntity());// 返回json格式：
               response = JSONObject.parseObject(result);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
       return response;
   }
}

package com.study.common.http;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;



public class PostExample {

	public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

	  OkHttpClient client = new OkHttpClient();

	 public String post(String url, String json) throws IOException {
	    RequestBody body = RequestBody.create(JSON, json);
	    Request request = new Request.Builder()
	        .url(url)
	        .post(body)
	        .build();
	    try (Response response = client.newCall(request).execute()) {
	      return response.body().string();
	    }
	  }

	 String bowlingJson(String player1, String player2) {
		 return "{'winCondition':'HIGH_SCORE',"
				 + "'name':'Bowling',"
				 + "'round':4,"
				 + "'lastSaved':1367702411696,"
				 + "'dateStarted':1367702378785,"
				 + "'players':["
				 + "{'name':'" + player1 + "','history':[10,8,6,7,8],'color':-13388315,'total':39},"
				 + "{'name':'" + player2 + "','history':[6,10,5,10,10],'color':-48060,'total':41}"
				 + "]}";
	 }
	  String bowlingJson1(String id, String user_id) {
	    return "{'id':'"+id+"',"
	        + "'user_id':'"+user_id+"'"
	    	+"}";
	  }

	  public static void main(String[] args) throws IOException {
	    PostExample example = new PostExample();
	 
	    String json = example.bowlingJson1("10", "000");
	    String response = example.post("http://localhost:8080/wx/getEpidemic", json);
	    System.out.println(response);
	    
	    Date lo = new Date();
	    
	    String s = com.study.common.util.DateUtils.stringToDate("1367702411696");
	     String ss = com.study.common.util.DateUtils.longToDate(lo.getTime());
	     System.out.println(ss);
	  }
}

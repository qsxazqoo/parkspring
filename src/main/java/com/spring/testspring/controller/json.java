//package com.spring.testspring.controller;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import com.spring.testspring.bean.ParkBean;
//
//
//public class json {
//
//	public static void main(String[] args) throws MalformedURLException, IOException {
//		String url = " https://citypark.tainan.gov.tw/App/parking.ashx?verCode=5177E3481D&type=2&ftype=1&exportTo=2";  
//		InputStream is = new URL(url).openStream();
//	    try {
//	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//	      StringBuilder sb = new StringBuilder();
//		    int cp;
//		    while ((cp = rd.read()) != -1) {
//		      sb.append((char) cp);
//		    }
//	      String jsonText = sb.toString();
//	      JSONArray jsonArray = new JSONArray(jsonText);
//	      List<ParkBean> list = new ArrayList<>();
//	      for(int i=0;i<jsonArray.length();i++) {
//	    	  ParkBean parkBean = new ParkBean();
//	    	  JSONObject jsonObject = jsonArray.getJSONObject(i);
//	    	  parkBean.setType(jsonObject.getString("停車場型態"));
//	    	  parkBean.setNum(jsonObject.getInt("停車場代碼"));
//	    	  parkBean.setName(jsonObject.getString("停車場名稱"));
//	    	  parkBean.setAddress(jsonObject.getString("停車場地址"));
//	    	  parkBean.setAnypark(jsonObject.getInt("即時車位"));
//	    	  parkBean.setBigcar(jsonObject.getInt("一般大型車"));
//	    	  parkBean.setSmallcar(jsonObject.getInt("一般小型車"));
//	    	  parkBean.setHandicapped(jsonObject.getInt("身障者小型車"));
//	    	  parkBean.setWonmenchildren(jsonObject.getInt("婦幼者小型車"));
//	    	  parkBean.setEnergy(jsonObject.getInt("綠能小型車"));
//	    	  parkBean.setCommon(jsonObject.getInt("一般機車"));
//	    	  parkBean.setMoto(jsonObject.getInt("身障者機車"));
//	    	  parkBean.setMoney(jsonObject.getString("收費時間"));
//	    	  parkBean.setTime(jsonObject.getString("收費費率"));
//	    	  parkBean.setLocal(jsonObject.getString("經緯度"));
//	    	  list.add(parkBean);
//	      }
//
//	    }catch(Exception e){
//	    System.err.println("Error: " + e.getMessage());
//	  }
//	}
//
//}

package com.spring.testspring.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.testspring.ParkRepository;
import com.spring.testspring.bean.ParkBean;

@Service
public class ParkService {

	@Autowired
	ParkRepository parkRepository;

	public LocalDateTime Hello() {
		return LocalDateTime.now();
	}

	public List<ParkBean> readJsonFromUrl() throws IOException, JSONException {
		String url = " https://citypark.tainan.gov.tw/App/parking.ashx?verCode=5177E3481D&type=2&ftype=1&exportTo=2";
		InputStream is = new URL(url).openStream();
		List<ParkBean> list = new ArrayList<>();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			StringBuilder sb = new StringBuilder();
			int cp;
			while ((cp = rd.read()) != -1) {
				sb.append((char) cp);
			}
			String jsonText = sb.toString();
			JSONArray jsonArray = new JSONArray(jsonText);
			int count = 0;
			for (int i = 0; i < jsonArray.length(); i++) {
				ParkBean parkBean = new ParkBean();
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				parkBean.setType(jsonObject.getString("停車場型態"));
				parkBean.setNum(jsonObject.getString("停車場代碼"));
				parkBean.setName(jsonObject.getString("停車場名稱"));
				parkBean.setAddress(jsonObject.getString("停車場地址"));
				parkBean.setAnypark(jsonObject.getInt("即時車位"));
				parkBean.setBigcar(jsonObject.getInt("一般大型車"));
				parkBean.setSmallcar(jsonObject.getInt("一般小型車"));
				parkBean.setHandicapped(jsonObject.getInt("身障者小型車"));
				parkBean.setWonmenchildren(jsonObject.getInt("婦幼者小型車"));
				parkBean.setEnergy(jsonObject.getInt("綠能小型車"));
				parkBean.setCommon(jsonObject.getInt("一般機車"));
				parkBean.setMoto(jsonObject.getInt("身障者機車"));
				parkBean.setTime(jsonObject.optString("收費時間","null"));
				parkBean.setMoney(jsonObject.getString("收費費率"));
				parkBean.setLocal(jsonObject.optString("經緯度","null"));
				System.out.println(count);
				count++;
				list.add(parkBean);
			}
			parkRepository.saveAll(list);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		return list;
	}
}

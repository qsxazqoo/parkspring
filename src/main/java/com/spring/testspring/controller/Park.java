package com.spring.testspring.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.testspring.bean.ParkBean;
import com.spring.testspring.service.ParkService;


@RestController
public class Park {
	
	@Autowired
	ParkService parkService;
	
	@GetMapping("/")
	public String save() {
		return "Hello";
	}
	
	@GetMapping("/read")
	public List<ParkBean> read() throws JSONException, IOException {
		List<ParkBean> a = parkService.readJsonFromUrl();
		return a;
	}
}

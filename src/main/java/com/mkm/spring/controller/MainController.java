package com.mkm.spring.controller;


import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@RestController
@RequestMapping("/get")
public class MainController {
	
	private static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value="/something", method=RequestMethod.GET)
	public String getJson(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Inside getJson Method");
		JSONObject json = new JSONObject();
		for(int i=0;i<10;i++) {
			try {
				json.put(String.valueOf(i), "11234");
			} catch (JSONException e) {
				logger.error("Exception in json",e);
			}
		}
		return json.toString();
	}
	

}

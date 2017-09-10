package com.mkm.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringStarterApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
		logger.info("***Service Started Successfully***");
	}
}

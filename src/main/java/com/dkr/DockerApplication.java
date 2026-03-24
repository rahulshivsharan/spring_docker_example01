package com.dkr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DockerApplication.class);
	
	public static void main(String[] args) {
		try {
			SpringApplication app = new SpringApplication(DockerApplication.class);
			app.run(args);
			logger.info("Spring boot docker application created");
		}catch(Exception e) {
			logger.error("Spring Boot application exception "+e.getMessage());
		}
		
	}

}

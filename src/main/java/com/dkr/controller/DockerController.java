package com.dkr.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	private static final Logger logger = LoggerFactory.getLogger(DockerController.class);
	
	@GetMapping("/hi")
	public Map<String, String> sayHi() {
		logger.info("Say hi");
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "Hello from Docker");
		return map;
	}
}

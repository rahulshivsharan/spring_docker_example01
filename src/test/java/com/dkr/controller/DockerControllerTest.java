package com.dkr.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(DockerController.class)
public class DockerControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getHi() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hi")
											.accept(MediaType.APPLICATION_JSON))
											.andExpect(MockMvcResultMatchers.status().isOk())
											.andDo(MockMvcResultHandlers.print())
											.andExpect(MockMvcResultMatchers.content().json("{ \"message\" : \"Hello from Docker\" }"));
	}
}

package com.gs.reversinglabs.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CallbackController {
	
	@GetMapping("/reversing-labs/health")
	public String health() {
		return "ping";
	}

	@PostMapping("/reversing-labs/callback")
	public void callback(@RequestBody Map<String, Object> body) {

		try {
			System.out.println(new ObjectMapper().writeValueAsString(body));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}

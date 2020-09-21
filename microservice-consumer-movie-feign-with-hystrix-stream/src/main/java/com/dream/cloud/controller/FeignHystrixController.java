package com.dream.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dream.cloud.feign.MyFeignClient;

@RestController
public class FeignHystrixController {
	
	@Autowired
	private MyFeignClient feignClient;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		String result = this.feignClient.sayHiFromClientOne(name);
		return result;
	}
}
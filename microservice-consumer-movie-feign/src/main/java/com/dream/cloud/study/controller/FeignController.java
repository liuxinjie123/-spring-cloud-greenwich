package com.dream.cloud.study.controller;

import com.dream.cloud.study.feign.MyFeignClient;
import com.dream.cloud.study.feign.MyFeignClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	private MyFeignClient feignClient;
	
	@Autowired
	private MyFeignClient2 feignClient2;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		String result = this.feignClient.sayHiFromClientOne(name);
		return result;
	}
	
	@GetMapping(value = "/city")
	public String city(@RequestParam String city) {
		String result = this.feignClient2.fromCityFromClientOne(city);
		return result;
	}
}

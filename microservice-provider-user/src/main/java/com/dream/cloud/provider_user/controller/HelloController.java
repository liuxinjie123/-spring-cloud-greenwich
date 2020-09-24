package com.dream.cloud.provider_user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	String port;

	// 提供的方法
	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "minbo") String name) {
		String result = "hi " + name + " , i am from port:" + port;
		System.out.println(result);
		return result;
	}

	// 提供的方法
	@RequestMapping("/city")
	public String city(@RequestParam(value = "city", defaultValue = "minbo") String city) {
		String result = "hi " + city + " , i am from port:" + port;
		System.out.println(result);
		return result;
	}
}

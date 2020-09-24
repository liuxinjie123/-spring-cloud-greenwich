package com.dream.cloud.ribbon.controller;

import com.dream.cloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

	@Autowired
	private RibbonService ribbonService;

	@GetMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return this.ribbonService.hiService(name);
	}
}

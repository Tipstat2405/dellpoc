package com.dell.poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/home")
public class HomeController {

	@GetMapping
	public String getHello() {
		
		return "Hello Vengalarayudu";
	}
}

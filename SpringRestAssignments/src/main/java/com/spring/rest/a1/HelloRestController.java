package com.spring.rest.a1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/hello.html")
	public String getHello() {
		return "Hello World!";
	}
}
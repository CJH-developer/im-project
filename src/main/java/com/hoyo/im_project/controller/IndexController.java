package com.hoyo.im_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	// 홈화면 출력
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
}

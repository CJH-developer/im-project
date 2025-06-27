package com.hoyo.im_project.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.hoyo.im_project.dto.UserDTO;
import com.hoyo.im_project.service.UserJoinService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class UserController {

	private final UserJoinService userJoinService;
	
	// 사용자 회원가입
	@PostMapping("/signForm")
	public String sign(UserDTO userDTO) {
		userJoinService.save(userDTO);
		return "index";
	}
	
	@PostMapping("/loginForm")
	public String login() {
		return "portal";
	}
	
}

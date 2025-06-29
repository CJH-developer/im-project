package com.hoyo.im_project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.hoyo.im_project.dto.UserDTO;
import com.hoyo.im_project.service.UserJoinService;
import com.hoyo.im_project.service.UserLoginService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class UserController {

	private final UserJoinService userJoinService;
	private final UserLoginService userLoginService;
	
	// 사용자 회원가입
	@PostMapping("/signForm")
	public String sign(UserDTO userDTO) {
		userJoinService.save(userDTO);
		return "index";
	}
	
	// 로그인
	@PostMapping("/loginForm")
	public String login(UserDTO userDTO, HttpSession session) {
		
		UserDTO loginResult = userLoginService.login(userDTO);
		
		if(loginResult != null) {
			// 로그인 성공
			session.setAttribute("login_id", loginResult.getId());
			System.out.println("아이디 찾았어");
			return "portal";
		}else {
			return "index";
		}		
	}
	
}

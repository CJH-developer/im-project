package com.hoyo.im_project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hoyo.im_project.dto.UserDTO;
import com.hoyo.im_project.entity.UserEntity;
import com.hoyo.im_project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserLoginService {
	
	private final UserRepository userRepository;

	public UserDTO login(UserDTO userDTO) {
		/*
		 * 1. 회원이 입력한 ID를 DB 조회
		 * 2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호 일치 여부 확인 
		 */
		
		Optional<UserEntity> byUserId = userRepository.findById(userDTO.getId());
		
		if(byUserId.isPresent()) {
			// 조회 성공
			UserEntity userEntity = byUserId.get();
			
			if(userEntity.getPassword().equals(userDTO.getPassword())) {
				// 비밀번호 일치
				// entity -> dto 변환 후 리턴
				UserDTO returnUserDTO = UserDTO.toUserDTO(userEntity);
				return returnUserDTO;
			}else {
				return null;
			}
			
			
		}else {
			return null;
		}
		
		
	}
}

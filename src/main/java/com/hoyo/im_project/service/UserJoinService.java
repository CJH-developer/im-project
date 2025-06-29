 package com.hoyo.im_project.service;

import org.springframework.stereotype.Service;
import com.hoyo.im_project.dto.UserDTO;
import com.hoyo.im_project.entity.UserEntity;
import com.hoyo.im_project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserJoinService {

	private final UserRepository userRepository;
    
	public void save(UserDTO userDTO) {
		UserEntity userEntity = UserEntity.toUserEntity(userDTO);
		userRepository.save(userEntity);
	}
}

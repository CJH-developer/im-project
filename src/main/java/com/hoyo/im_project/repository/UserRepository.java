package com.hoyo.im_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoyo.im_project.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	// 아이디로 회원 정보 조회 ( select * from hoyo_cm_user where id=? )
	Optional<UserEntity> findById(String id);
	
}

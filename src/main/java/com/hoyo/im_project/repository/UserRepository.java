package com.hoyo.im_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoyo.im_project.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

}

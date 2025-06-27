package com.hoyo.im_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hoyo.im_project.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="hoyo_cm_user")
public class UserEntity {
	
	@Id
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	public static UserEntity toUserEntity(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(userDTO.getId());
		userEntity.setName(userDTO.getName());
		userEntity.setPassword(userDTO.getPassword());
		
		return userEntity;
	}
}

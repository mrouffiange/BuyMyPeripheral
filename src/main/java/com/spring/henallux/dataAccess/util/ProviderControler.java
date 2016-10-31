package com.spring.henallux.dataAccess.util;

import com.spring.henallux.dataAccess.entity.UserEntity;
import com.spring.henallux.model.User;

public class ProviderControler {
	public UserEntity userModelToUserEntty(User user){
		UserEntity userEntity = new UserEntity();
		userEntity.setLogin(user.getLogin());
		userEntity.setPassword(user.getPassword());
		userEntity.setBirthdate(user.getBirthdate());
		userEntity.setEmail(user.getEmail());
		userEntity.setFaxNumber(user.getFaxNumber());
		userEntity.setFirstname(user.getFirstname());
		userEntity.setLastname(user.getFirstname());
		userEntity.setLocalityAddress(user.getLocalityAddress());
		userEntity.setMale(user.getMale());
		userEntity.setPhoneNumber(user.getPhoneNumber());
		userEntity.setStreetAddress(user.getStreetAddress());
		userEntity.setType(user.getType());
		return userEntity;
	}
	
	public User userEntityToUSerModel(UserEntity userEntity){
		User user = new User();
		user.setLogin(userEntity.getLogin());
		user.setPassword(userEntity.getPassword());
		user.setBirthdate(userEntity.getBirthdate());
		user.setEmail(userEntity.getEmail());
		user.setFaxNumber(userEntity.getFaxNumber());
		user.setFirstname(userEntity.getFirstname());
		user.setLastname(userEntity.getFirstname());
		user.setLocalityAddress(userEntity.getLocalityAddress());
		user.setMale(userEntity.getMale());
		user.setPhoneNumber(userEntity.getPhoneNumber());
		user.setStreetAddress(userEntity.getStreetAddress());
		user.setType(userEntity.getType());
		return user;
	}
}

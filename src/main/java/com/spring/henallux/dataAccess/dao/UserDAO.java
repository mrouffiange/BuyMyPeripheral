package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.UserEntity;
import com.spring.henallux.dataAccess.repository.UserRepository;
import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.User;

@Service
@Transactional
public class UserDAO {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProviderConverter providerConverter;
	
	public User save(User user){
		UserEntity userEntity = providerConverter.userModelToUserEntity(user);
		userEntity = userRepository.save(userEntity);
		return providerConverter.userEntityToUSerModel(userEntity);
	}
	
	public User connection(String login, String password){
		UserEntity userEntity = userRepository.findOne(login);
		if(userEntity.getPassword().equals(password)){
			return providerConverter.userEntityToUSerModel(userEntity);
		}
		else{
			return null;
		}
		
	}
}

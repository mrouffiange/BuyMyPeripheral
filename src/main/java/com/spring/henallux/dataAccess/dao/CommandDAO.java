package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.repository.CommandRepository;

@Service
@Transactional
public class CommandDAO {
	
	@Autowired
	private CommandRepository CommandRepository;
}

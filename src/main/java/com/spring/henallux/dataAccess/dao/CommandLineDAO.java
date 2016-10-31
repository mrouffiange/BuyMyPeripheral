package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.repository.CommandLineRepository;

@Service
@Transactional
public class CommandLineDAO {
	
	@Autowired
	private CommandLineRepository commandLineRepository;
}

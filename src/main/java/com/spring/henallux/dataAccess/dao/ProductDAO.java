package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.repository.ProductRepository;

@Service
@Transactional
public class ProductDAO {
	
	@Autowired
	private ProductRepository productRepository;
}

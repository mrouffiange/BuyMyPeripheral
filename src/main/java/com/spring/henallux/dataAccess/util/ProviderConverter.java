package com.spring.henallux.dataAccess.util;

import org.springframework.stereotype.Component;

import com.spring.henallux.dataAccess.entity.*;
import com.spring.henallux.model.*;

@Component
public class ProviderConverter {
	
	public UserEntity userModelToUserEntity(User user){
		UserEntity userEntity = new UserEntity();
		userEntity.setLogin(user.getLogin());
		userEntity.setPassword(user.getPassword());
		userEntity.setBirthdate(user.getBirthdate());
		for(Command command : user.getCommands()){
			userEntity.getCommands().add(commandModelToCommandEntity(command));
		}		
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
		for(CommandEntity commandEntity : userEntity.getCommands()){
			user.getCommands().add(commandEntityToCommandModel(commandEntity));
		}	
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
	
	public CommandEntity commandModelToCommandEntity(Command command){
		CommandEntity commandEntity = new CommandEntity();
		commandEntity.setCommandDate(command.getCommandDate());
		for(CommandLine commandLine : command.getCommandLines()){
			commandEntity.getCommandLines().add(commandLineModelToCommandLineEntity(commandLine));
		}
		commandEntity.setNumCommand(command.getNumCommand());
		commandEntity.setPaid(command.getPaid());
		commandEntity.setUser(userModelToUserEntity(command.getUser()));
		return commandEntity;
	}
	
	public Command commandEntityToCommandModel(CommandEntity commandEntity){
		Command command = new Command();
		command.setCommandDate(commandEntity.getCommandDate());
		for(CommandLineEntity commandLineEntity : commandEntity.getCommandLines()){
			command.getCommandLines().add(commandLineEntityToCommandLineModel(commandLineEntity));
		}
		command.setNumCommand(commandEntity.getNumCommand());
		command.setPaid(commandEntity.getPaid());
		command.setUser(userEntityToUSerModel(commandEntity.getUser()));
		return command;
	}

	public CommandLineEntity commandLineModelToCommandLineEntity(CommandLine commandLine){
		CommandLineEntity commandLineEntity = new CommandLineEntity();
		commandLineEntity.setCommand(commandModelToCommandEntity(commandLine.getCommand()));
		commandLineEntity.setNumLine(commandLine.getNumLine());
		commandLineEntity.setProduct(productModelToProductEntity(commandLine.getProduct()));
		commandLineEntity.setQuantity(commandLine.getQuantity());
		commandLineEntity.setRealPrice(commandLine.getRealPrice());
		return commandLineEntity;
	}
	
	public CommandLine commandLineEntityToCommandLineModel(CommandLineEntity commandLineEntity){
		CommandLine commandLine = new CommandLine();
		commandLine.setCommand(commandEntityToCommandModel(commandLineEntity.getCommand()));
		commandLine.setNumLine(commandLineEntity.getNumLine());
		commandLine.setProduct(productEntityToProductModel(commandLineEntity.getProduct()));
		commandLine.setQuantity(commandLineEntity.getQuantity());
		commandLine.setRealPrice(commandLineEntity.getRealPrice());
		return commandLine;
	}
	public DiscountEntity discountModelToDiscountEntity(Discount discount){
		DiscountEntity discountEntity = new DiscountEntity();
		discountEntity.setCategory(categoryModelToCategoryEntity(discount.getCategory()));
		discountEntity.setCode(discount.getCode());
		discountEntity.setDiscountInPourcent(discount.getDiscountInPourcent());
		discountEntity.setBeginValidityDate(discount.getBeginValidityDate());
		discountEntity.setEndValidityDate(discount.getEndValidityDate());
		return discountEntity;
	}
	
	public Discount discountEntityToDiscountModel(DiscountEntity discountEntity){
		Discount discount = new Discount();
		discount.setCategory(categoryEntityToCategoryModel(discountEntity.getCategory()));
		discount.setCode(discountEntity.getCode());
		discount.setDiscountInPourcent(discountEntity.getDiscountInPourcent());
		discount.setBeginValidityDate(discountEntity.getBeginValidityDate());
		discount.setEndValidityDate(discountEntity.getEndValidityDate());
		return discount;
	}
	public ProductEntity productModelToProductEntity(Product product){
		ProductEntity productEntity = new ProductEntity();
		productEntity.setBrand(product.getBrand());
		productEntity.setCategory(categoryModelToCategoryEntity(product.getCategory()));
		productEntity.setDescription(product.getDescription());
		productEntity.setGrade(product.getGrade());
		productEntity.setNumReference(product.getNumReference());
		productEntity.setUnitPrice(product.getUnitPrice());
		return productEntity;
	}
	
	public Product productEntityToProductModel(ProductEntity productEntity){
		Product product = new Product();
		product.setBrand(productEntity.getBrand());
		product.setCategory(categoryEntityToCategoryModel(productEntity.getCategory()));
		product.setDescription(productEntity.getDescription());
		product.setGrade(productEntity.getGrade());
		product.setNumReference(productEntity.getNumReference());
		product.setUnitPrice(productEntity.getUnitPrice());
		return product;
	}
	public CategoryEntity categoryModelToCategoryEntity(Category category){
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCodeCategory(category.getCodeCategory());
		categoryEntity.setCategoryGroup(category.getCategoryGroup());
		for(Product product : category.getProducts()){
			categoryEntity.getProducts().add(productModelToProductEntity(product));
		}
		return categoryEntity;
	}
	
	public Category categoryEntityToCategoryModel(CategoryEntity categoryEntity){
		Category category = new Category();
		category.setCodeCategory(categoryEntity.getCodeCategory());
		category.setCategoryGroup(categoryEntity.getCategoryGroup());
		for(ProductEntity productEntity : categoryEntity.getProducts()){
			category.getProducts().add(productEntityToProductModel(productEntity));
		}
		return category;
	}
}
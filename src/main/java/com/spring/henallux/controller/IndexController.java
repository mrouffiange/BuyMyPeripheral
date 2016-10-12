package com.spring.henallux.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, Locale locale){
		//model.addAttribute("messageToDisplay", messageSource.getMessage("welcome", null, locale));
		//model.addAttribute("magicKeyForm", new MagicKeyForm());
		return "integrated:index";
	}
}

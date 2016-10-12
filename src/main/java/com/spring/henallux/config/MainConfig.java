package com.spring.henallux.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class MainConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public TilesConfigurer tilesConfigurer(){
		final TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String [] {"WEB-INF/resources/tiles.xml"});
		configurer.setCheckRefresh(true);
		return configurer;
	}
	
	@Bean
	public ViewResolver tilesViewResolver(){
		final TilesViewResolver resolver = new TilesViewResolver();
		resolver.setViewClass(TilesView.class);
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	@Bean
	public DefaultMessageCodesResolver defaultMessageCodesResolver(){
		DefaultMessageCodesResolver defaultMessageCodesResolver = new DefaultMessageCodesResolver();
		return defaultMessageCodesResolver;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSourge(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setBasenames("translations/general", "translations/errors");
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}
	
	@Bean
	public LocaleResolver localeResolver(){
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		resolver.setDefaultLocale(new Locale("fr"));
		resolver.setCookieName("myLocaleCookie");
		resolver.setCookieMaxAge(-1);
		return resolver;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("locale");
		registry.addInterceptor(interceptor);
	}
}
package com.klednatee.cakesystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig  implements WebMvcConfigurer {
	public void addViewControllers(ViewControllerRegistry registry) {
		
		registry.addViewController("/products/list").setViewName("products/list-prducts");
		//registry.addViewController("/").setViewName("products/list-prducts");
		
//		registry.addViewController("/hello").setViewName("hello");
//		registry.addViewController("/login").setViewName("login");
	}
}

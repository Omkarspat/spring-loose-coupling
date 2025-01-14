package com.day1Spring.loose_coupling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorld {

	public static void main(String[] args) {
		
		// Launch Spring Context
		//Configure the things that spring manage
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));

	}

}

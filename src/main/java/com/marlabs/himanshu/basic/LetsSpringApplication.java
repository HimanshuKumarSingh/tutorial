package com.marlabs.himanshu.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LetsSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LetsSpringApplication.class, args);
		
		ApplicationContext applicationContext=SpringApplication.run(LetsSpringApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}

package com.example.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurable  =SpringApplication.run(BookApplication.class, args);
		String[] beanDefinitions = configurable.getBeanDefinitionNames();
		for(String bean :beanDefinitions)
		{
		System.out.println(bean);
		}
	}

}

package com.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.model.Auto;
import com.test.spring.Config;

public class Main {
	
	public static void main(String s[]) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			System.out.println(context.getBean(Auto.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

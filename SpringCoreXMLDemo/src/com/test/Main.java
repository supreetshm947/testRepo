package com.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.model.Auto;

public class Main {
	public static void main(String s[]) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			Auto db7 = context.getBean(Auto.class);
			db7 = context.getBean(Auto.class);
			System.out.println(db7);
			((ConfigurableApplicationContext)context).close();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

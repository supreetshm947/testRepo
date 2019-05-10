package com.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configure.Config;
import com.model.Shape;
import com.model.Square;

public class Main {
	public static void main(String s[]) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			Square square = (Square)context.getBean(Shape.class);
			System.out.println(square);
			((ConfigurableApplicationContext)context).close();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

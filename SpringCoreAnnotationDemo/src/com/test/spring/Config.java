package com.test.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.model.Engine;
import com.test.model.Transmission;

@Configuration
@ComponentScan("com.test.model")
public class Config {

	@Bean
	public Engine engine() {
		return new Engine("v8");
	}
	
	@Bean
	public Transmission transmission() {
		return new Transmission("Auto");
	}
}

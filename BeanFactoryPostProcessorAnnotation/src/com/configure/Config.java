package com.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.model.Point;
import com.model.Square;

@Configuration
@PropertySource("classpath:/square.properties")
public class Config {

	@Value("${pointA.x}")
	int pointA_x;
	
	@Value("${pointA.y}")
	int pointA_y;
	
	@Value("${pointB.x}")
	int pointB_x;
	
	@Value("${pointB.y}")
	int pointB_y;
	
	@Value("${pointC.x}")
	int pointC_x;
	
	@Value("${pointC.y}")
	int pointC_y;
	
	@Value("${pointD.x}")
	int pointD_x;
	
	@Value("${pointD.y}")
	int pointD_y;
	
	@Bean
	public Point pointA() {
		return new Point(pointA_x, pointA_y);
	}
	
	@Bean
	public Point pointB() {
		return new Point(pointB_x, pointB_y);
	}
	
	@Bean
	public Point pointC() {
		return new Point(pointC_x, pointC_y);
	}
	
	@Bean
	public Point pointD() {
		return new Point(pointD_x, pointD_y);
	}
	
	@Bean
	public Square square() {
		return new Square(pointA(), pointB(), pointC(), pointD());
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       return new PropertySourcesPlaceholderConfigurer();
    }
	
}

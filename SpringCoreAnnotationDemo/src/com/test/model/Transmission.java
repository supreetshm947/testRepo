package com.test.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Transmission implements InitializingBean, DisposableBean {

	private String transType;

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Transmission(String transType) {
		super();
		this.transType = transType;
	}

	public Transmission() {
		super();
	}
	
	@Override
	public String toString() {
		return "Transmission [transType=" + transType + "]";
	}
	
	public void destroy() {
		System.out.println("Transmission destry");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Transmission init");
	}
	
}

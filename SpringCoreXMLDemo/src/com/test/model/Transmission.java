package com.test.model;

public class Transmission {

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

	@Override
	public String toString() {
		return "Transmission [transType=" + transType + "]";
	}
	
	public void init() {
		System.out.println("Transmission init");
	}
	
	public void destroy() {
		System.out.println("Transmission destroy");
	}
	
}

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
	
}

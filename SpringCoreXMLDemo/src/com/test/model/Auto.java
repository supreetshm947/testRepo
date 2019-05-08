package com.test.model;

public class Auto {
	private Engine engine;
	private Transmission transmission;
	
	public Auto(Engine engine, Transmission transmission) {
		super();
		this.engine = engine;
		this.transmission = transmission;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return "Auto [engine=" + engine + ", transmission=" + transmission + "]";
	}

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

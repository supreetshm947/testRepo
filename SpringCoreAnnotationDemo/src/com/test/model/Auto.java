package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto {
	private Engine engine;
	private Transmission transmission;
	
	@Autowired
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

	@Override
	public String toString() {
		return "Auto [engine=" + engine + ", transmission=" + transmission + "]";
	}
	
}

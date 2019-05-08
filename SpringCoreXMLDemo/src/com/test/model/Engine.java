package com.test.model;

public class Engine {
	private String engineName;

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public Engine(String engineName) {
		super();
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + "]";
	}
	
}

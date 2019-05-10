package com.test.model;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	private String engineName;

	public String getEngineName() {
		return engineName;
	}
	
	@Required
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

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

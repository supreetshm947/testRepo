package com.test.model;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	private String engineName;

	@Required
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
	
	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + "]";
	}
	
}

package com.esc.patterns.singleton;

// Singleton pattern: Enum instances are thread safe and are compile time constants
public enum Database {
	
	INSTANCE;
	
	void connect() {
		System.out.println("Connnected to database");
	}
	
	void disconnect() {
		System.out.println("Disconnnected to database");
	}

}

package com.esc.patterns.singleton;

// Singleton pattern: Lazy version
public class DatabaseConnection {
	
	private static DatabaseConnection INSTANCE;

	private DatabaseConnection() {}
	
	public static DatabaseConnection getInstance() {
		if (INSTANCE == null)
			// Synchronized blocks are slow
			synchronized(DatabaseConnection.class) {
				INSTANCE = new DatabaseConnection();
			}
			
		return INSTANCE;
	}
	
	void connect() {
		System.out.println("Connnected to database");
	}
	
	void disconnect() {
		System.out.println("Disconnnected to database");
	}
}

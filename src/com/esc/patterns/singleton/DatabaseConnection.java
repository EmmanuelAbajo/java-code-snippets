package com.esc.patterns.singleton;

// Create an object while making sure only a single object gets created
// This ensures there is only a single instance of the class available in the application
// Singleton pattern: Lazy version
public class DatabaseConnection {
	
	private static DatabaseConnection INSTANCE;

	// The constructor is private so that the new operator cannot
	// be used to instantiate the class
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

	// Prevent cloning of the singleton class
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
}

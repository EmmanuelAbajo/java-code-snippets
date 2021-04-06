package com.esc.asyncprog;

public class ThreadException {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			throw new RuntimeException("Internal Server Error");
		});
		
		thread.setName("worker-thread");
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Thread name: " + t.getName() + " Exception: " + e.getMessage());
				
			}
		});
		
		thread.start();

	}

}

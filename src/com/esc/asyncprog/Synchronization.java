package com.esc.asyncprog;

public class Synchronization {
	public static void main(String[] args) {
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("CPU cores: " + processors);
		
		Table obj = new Table();

		new Thread(() ->  obj.printTable(5)).start();
		new Thread(() ->  obj.printTable(100)).start();

	}
}

class Table {
	void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		printer();
	}

	void printer() {
		try {
			System.out.println("Current thread: " + Thread.currentThread().getName());
			Thread.sleep(400);
			System.out.println("Hi there");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

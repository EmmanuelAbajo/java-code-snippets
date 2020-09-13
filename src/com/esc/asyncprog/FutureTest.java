package com.esc.asyncprog;

import java.util.concurrent.CompletableFuture;

public class FutureTest {
	
	public static int longProcess(int i) {
		try {
			System.out.println("Thread sleep");
			Thread.sleep(5000);
			System.out.println("I'm done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return i*5;
	}
	
	public static void IOProcess() {
		CompletableFuture.supplyAsync(()->{
			return longProcess(2);
		}).thenAcceptAsync(value -> System.out.println(value));
		
		System.out.println("Emmanuel");
	}
	
	public static void main(String[] arg) {
		IOProcess();
	}

}

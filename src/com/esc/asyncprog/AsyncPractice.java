package com.esc.asyncprog;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AsyncPractice {
	
	static void timeTakingProcess() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}
	
	static void logValue(String item) {
		System.out.println(item);
	}
	
	public static void main(String[] args) 
			throws InterruptedException, ExecutionException {
		
		CompletableFuture.supplyAsync(() -> {
		    try {
		    	timeTakingProcess();
		    } catch (InterruptedException e) {
		        throw new IllegalStateException(e);
		    }
		    return "Emmanuel";
		})
		.thenApply(name -> { return "Hello "+name; })
		.thenAccept(item -> logValue(item));
				
		System.out.println("Thread Count: "+ Thread.activeCount());
		System.out.println("Hello, my name is Emmanuel");
		System.out.println("Thread going to sleep for 3s");
		Thread.sleep(3000); // This is to ensure that the future completes before the main thread exits
		System.out.println("Thread resumes...");
		
		// If the main method is bound to exit before the completion of the future, We'll need the future.get() 
		// to block the main thread from exiting. If not, we don't need to block the main thread as the future 
		// will complete before the main thread is done.
		// future.get();
		
	}
}

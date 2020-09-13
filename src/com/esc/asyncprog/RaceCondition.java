package com.esc.asyncprog;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Solution: Only one thread can read and write to a shared variable at a particular time.
// We use the synchronized keyword to achieve this.
public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {
		Vehicle car = new Vehicle();

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 1000; i++) {
            executorService.submit(() -> car.increaseCount());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        
        System.out.println("Final count is : " + car.getCount());

	}
}

class Vehicle {

	private int count;

	int getCount() {
		return count;
	}

	void setCount(int count) {
		this.count = count;
	}

	synchronized void increaseCount() {
		try {
			System.out.println(Thread.currentThread().getName()+": start");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+": end");
			this.count++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void logValue(String name, int i) {
		System.out.println(name + ": " + i);
	}
}

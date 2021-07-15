package com.esc.asyncprog;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class ThreadInterruptionDemo {
	
	public static void main(String... args) {
		Thread task1 = new Thread(new BlockingThread());
		task1.start();
		task1.interrupt();
		
		Thread task2 = new Thread(new Computation(new BigInteger("2"),new BigInteger("1")));
		task2.start();
		task2.interrupt();
	}
	
	static class BlockingThread implements Runnable {

		@Override
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Exiting blocking thread");
			}
		}
	}
	
	static class Computation implements Runnable {
		
		private BigInteger base;
		private BigInteger power;
		
		public Computation(BigInteger base, BigInteger power) {
			super();
			this.base = base;
			this.power = power;
		}

		@Override
		public void run() {
			System.out.println(pow(base,power));
		}
		
		private BigInteger pow(BigInteger base, BigInteger power) {
			BigInteger result = BigInteger.ONE;
			
			for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
				if (Thread.currentThread().isInterrupted()) {
					System.out.println("Thread interrupted");
					return BigInteger.ZERO;
				}
				result = result.multiply(base);
			}
			
			return result;
		}
		
	}

}

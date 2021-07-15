package com.esc.asyncprog;

public class ThreadJoinDemo {
	
	public static void main(String... args) {
		CalculateTask task1 = new CalculateTask(2,5);
		CalculateTask task2 = new CalculateTask(2,5);
		
		task1.start();
		task2.start();
		
		try {
			task1.join(2000);
			task2.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(task1.getResult() + task2.getResult());
	}
	
	static class CalculateTask extends Thread {
		private double result;
		private int base;
		private int power; 
		
		CalculateTask(int base, int power) {
			this.base = base;
			this.power = power;
		}

		@Override
		public void run() {
			result = Math.pow(base, power);
			
		}
		
		public double getResult() {
			return result;
		}
		
	}

}

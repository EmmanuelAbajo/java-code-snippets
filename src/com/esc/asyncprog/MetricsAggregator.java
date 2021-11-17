package com.esc.asyncprog;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MetricsAggregator {
	
	public static void main(String[] args) {
		Metrics metrics = new Metrics();
		
		BusinessLogic bs1 = new BusinessLogic(metrics);
		BusinessLogic bs2 = new BusinessLogic(metrics);
		
		Thread metricsPrinterThread = new Thread(new MetricsPrinter(metrics));
		
		bs1.start();
		bs2.start();
		metricsPrinterThread.start();
	}

	static class MetricsPrinter implements Runnable {

		private final Metrics metrics;

		MetricsPrinter(Metrics metrics) {
			this.metrics = metrics;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				double average = metrics.getAverage();
				System.out.println("Current Average: " + average);
			}

		}

	}

	static class BusinessLogic extends Thread {

		private final Metrics metrics;
		private Random random = new Random();

		BusinessLogic(Metrics metrics) {
			this.metrics = metrics;
		}

		@Override
		public void run() {
			while (true) {
				long start = System.currentTimeMillis();
				try {
					TimeUnit.MILLISECONDS.sleep(random.nextInt(10));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				long end = System.currentTimeMillis();
				metrics.addSample(end - start);
			}
		}
	}

	static class Metrics {
		private long count = 0;
		private volatile double average = 0.0;

		synchronized void addSample(long sample) {
			double currentSum = average * count;
			count++;
			average = (currentSum + sample) / count;
		}

		double getAverage() {
			return average;
		}
	}

}

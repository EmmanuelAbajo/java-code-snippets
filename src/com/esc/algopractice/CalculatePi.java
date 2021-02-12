package com.esc.algopractice;

import java.util.Random;

public class CalculatePi {

	private static double getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		 
		Random random = new Random();
		    return random.doubles(min,max)
		      .findFirst()
		      .getAsDouble();
		
	}

	static Point generateRandomPoint(int min, int max) {
		double x = getRandomNumberInRange(min, max);
		double y = getRandomNumberInRange(min, max);

		return new Point(x, y);
	}

	static boolean isPointInCircle(Point p, int radius) {
		return Math.sqrt(Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2)) < radius;
	}

	public static void main(String[] args) {
		int N = 1000000;
		int radius = 1;
		int noOfHits = 0;
		for (int i = 0; i < N; i++) {
			Point p = generateRandomPoint(-radius, radius);
			if (isPointInCircle(p, radius)) {
				noOfHits++;
			}
		}

		double pi = (4 * noOfHits) / N;
		System.out.println("Value of hits: " + noOfHits);
		System.out.println("Value of Pi: " + pi);
	}

}

class Point {
	private double x;
	private double y;

	protected Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

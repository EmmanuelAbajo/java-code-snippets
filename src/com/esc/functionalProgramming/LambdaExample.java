package com.esc.functionalProgramming;

import java.util.Comparator;

public class LambdaExample {
	
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Rumning a lambda function");
		new Thread(runnable).start();
		new Thread(() -> System.out.println("Rumning another lambda function")).start();
		
		Comparator<Integer> comparator = (a, b) -> { return a.compareTo(b); };
		System.out.println("Comparator result: " + comparator.compare(2, 3));
	
	}

}

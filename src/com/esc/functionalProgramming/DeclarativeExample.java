package com.esc.functionalProgramming;

import java.util.stream.IntStream;

public class DeclarativeExample {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.printf("Sum: %d", sum);
	}

}

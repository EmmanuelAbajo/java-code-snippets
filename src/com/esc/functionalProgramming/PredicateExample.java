package com.esc.functionalProgramming;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2 == 0;
		Predicate<Integer> p2 = i -> i%3 == 0;
		
		System.out.println("Is Even: "+ p1.test(12));
		System.out.println("Is divisible by 2 and 3: "+ p1.and(p2).test(10));
		System.out.println("Is divisible by 2 or 3: "+ p1.or(p2).test(10));
		System.out.println("Is not divisible by 2 and 3: "+ p1.and(p2).negate().test(10));
	}

}

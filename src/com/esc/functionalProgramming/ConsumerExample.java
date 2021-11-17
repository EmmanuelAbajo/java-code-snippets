package com.esc.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
		Consumer<String> consumer2 = s -> System.out.println(s.toLowerCase());
		
		consumer.accept("consumer functional interface");
		
		List<String> names = Arrays.asList("Joe", "John", "Mike");
		names.forEach(s -> consumer.andThen(consumer2).accept(s)); // Consumer chaining
		
		BiConsumer<String, String> b1 = (a,b) -> System.out.println("Item one: "+ a +" Item two: "+b);
		b1.accept("James", "John");
		
		BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println("Multiplication: "+ (a*b));
		BiConsumer<Integer, Integer> divide = (a,b) -> System.out.println("Division: "+ (a/b));
		
		multiply.andThen(divide).accept(4, 2);
	}

}

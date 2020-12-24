package com.esc.datastructures;

import java.util.Stack;

public class StackPractice {
	
	// They can be implemented with arrays or linked lists
	// It's good for keeping track of states
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		
		names.push("john");
		names.push("Jerry");
		names.push("Tom");
		names.push("Richard");
		names.push("Temi");
		
		System.out.println(names);
		
		System.out.println("Stack size: "+ names.size());
		System.out.println("Next up: "+ names.peek());
		
		if (!names.empty()) System.out.println("Recently popped: "+ names.pop());
		
		System.out.println(names);
	}

}

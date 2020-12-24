package com.esc.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
	
	// A Queue is implemented as a linked list or priority queue in java
	// They are good for storing order of processes
	// It has a FIFO policy
	public static void main(String[] args) {
		
		Queue<String> names = new LinkedList<>();
		
		names.add("john");
		names.add("Jerry");
		names.add("Tom");
		names.add("Richard");
		names.add("Temi");
		names.add("Emmy");
		names.add("Jack");
		
		System.out.println(names);
		
		System.out.println("Next up: "+ names.peek());
		System.out.println("Recently dequeued: "+ names.remove());
		
		System.out.println(names);
	}

}

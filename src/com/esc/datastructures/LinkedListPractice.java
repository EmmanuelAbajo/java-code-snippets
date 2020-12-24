package com.esc.datastructures;

import java.util.LinkedList;

public class LinkedListPractice {
	
	// LinkedLists are quicker at inserting and deleting dynamically sized data
	// It can be used to implement a queue and a stack
	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		
		names.add("john");
		names.add("Jerry");
		names.add("Tom");
		names.add("Richard");
		names.addFirst("Temi");
		names.addLast("Emmy");
		names.add("Jack");
		
		System.out.println(names);
		System.out.println("First name: "+ names.getFirst());
		System.out.println("Last name: "+ names.getLast());
		System.out.println("Index of Emmy: "+ names.indexOf("Emmy"));
		System.out.println("Linked list size: "+ names.size());
		
		names.removeFirst();
		names.removeLast();
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
	}
	

}

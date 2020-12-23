package com.esc.stringpractice;

public class StringManipulation {
	
	static String reverseString(String input) {
		StringBuffer buffer =  new StringBuffer();
		for(int i=input.length() - 1;  i >= 0; i--) {
			buffer.append(input.charAt(i));
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		// Strings are immutable
		// They can be created as: String literals or String objects
		String firstName = "Joe";
		String lastName = "Mike";
		
		String name = firstName + " " + lastName;
		String name1 = firstName.concat(" ").concat(lastName);
		
		System.out.println(name.trim());
		System.out.println(name1);
		
		System.out.println("Char at index 2: "+ name.charAt(2));
		System.out.println("Index of char e: "+ name.indexOf('e'));
		
		// Convert string to char array
		char[] charArr = name.toCharArray();
		System.out.println(charArr[2]);
		
		// Note that this does not modify the string but creates a new string with the initial string as input
		System.out.println(name.toUpperCase()); 
		System.out.println(name1.toLowerCase()); 
		
		StringBuilder builder = new StringBuilder("abc"); // abc
		builder.append("def"); // abcdef
		builder.append("ghi"); // abcdefghi
		builder.insert(2, "123"); // ab123cdefghi
		builder.delete(5, 7); // ab123efghi
		
		String letters = builder.toString();
		System.out.println(letters.isEmpty());
		System.out.println(letters);
		
		// StringBuffer class is thread safe. It uses synchronized classes
		StringBuffer buffer = new StringBuffer("abc"); // abc
		buffer.append("def"); // abcdef
		buffer.append("ghi"); // abcdefghi
		buffer.insert(2, "123"); // ab123cdefghi
		buffer.delete(5, 7); // ab123efghi
		
		String letters2 = buffer.toString();
		System.out.println(letters2);
		System.out.println(reverseString(letters2));

	}

}

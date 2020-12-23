package com.esc.stringpractice;

public class StringChallenge {

	// Find the number of vowels and consonants in a given string
	// Create a method that takes string input and prints out number of vowels and consonants in it
	// Assume string only contains letters and white space
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "HellO";
		String s2 = " there is a quiet Mouse";
		String s3 = " I am happy ";
		System.out.println(noOfVowels(s2));

	}
	
	public static int noOfVowels(String input) {
		String vowels = "aeiou";
		String stdInput = input.toLowerCase().trim();
		int vowelCount = 0;
		for (char letter: stdInput.toCharArray()) {
			if (vowels.contains(Character.toString(letter))) {
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	public static int noOfConsonants(String input) {
		return 1;
	}

}

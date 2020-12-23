package com.esc.stringpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringChallengeTest {
	
	static String s1, s2, s3;
	
	@BeforeAll
	static void setUp() {
		s1 = "HellO";
		s2 = " there is a quiet Mouse";
		s3 = " I am happy ";
	}
	
	@Test
	void vowelsShouldBeCountedCorrectly() {
		assertEquals(2, StringChallenge.noOfVowels(s1), "No of vowels must be 2");	
		assertEquals(10,StringChallenge.noOfVowels(s2), "No of vowels must be 10");	
		assertEquals(4,StringChallenge.noOfVowels(s3), "No of vowels must be 4");	
	}
	
	@Test
	void consonantsShouldBeCountedCorrectly() {
		assertEquals(3,StringChallenge.noOfVowels(s1), "No of consonants must be 3");	
		assertEquals(8,StringChallenge.noOfVowels(s2), "No of consonants must be 8");	
		assertEquals(4,StringChallenge.noOfVowels(s3), "No of consonants must be 4");	
	}

}

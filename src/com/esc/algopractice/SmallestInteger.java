package com.esc.algopractice;

import java.util.Arrays;

public class SmallestInteger {

	static int findSmallestNaturalNumber(int[] arr) {
		int smallestInt = 1;

		if (arr.length == 0)
			return smallestInt;

		Arrays.sort(arr);

		if (arr[0] > 1)
			return smallestInt;
		if (arr[arr.length - 1] <= 0)
			return smallestInt;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == smallestInt) {
				smallestInt++;
			}
		}

		return smallestInt;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,3,6,4,1,2};
		int[] arr2 = {5, -1,-3};
		System.out.println(findSmallestNaturalNumber(arr1));
		System.out.println(findSmallestNaturalNumber(arr2));
	}

}

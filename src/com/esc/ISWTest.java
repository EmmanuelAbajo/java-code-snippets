package com.esc;

import java.util.stream.IntStream;

public class ISWTest {

	// TODO: Optimize method
	static int numberCheck(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == n) {
					count++;
					if (count > 1)
						break;
				}
			}
			if (count > 1)
				break;

		}

		if (count == 1)
			return count;
		return 0;
	}

	// TODO: Correct program logic
	static int NUnique(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			boolean contains = IntStream.of(arr).anyMatch(x -> x == (n - a));
			System.out.println(contains);
			if (contains)
				count++;
			if (count > 1)
				break;
		}
		if (count == 1)
			return count;
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 3, 2, 4 };
		System.out.println(numberCheck(arr, 5));
		System.out.println(NUnique(arr, 5));
	}

}

package com.esc.algopractice;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private Map<Integer, Integer> memoizeStore = new HashMap<>();

	int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fib(n - 2) + fib(n - 1);
	}

	int fibWithMemoization(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		if (this.memoizeStore.containsKey(n)) {
			return this.memoizeStore.get(n);
		}

		int result = fibWithMemoization(n - 2) + fibWithMemoization(n - 1);
		this.memoizeStore.put(n, result);

		return result;
	}

}

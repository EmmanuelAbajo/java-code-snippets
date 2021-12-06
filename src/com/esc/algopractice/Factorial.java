package com.esc.algopractice;

import java.math.BigInteger;

public class Factorial {

	BigInteger factorialWithRecursion(int n) {
		if (n == 0)
			return BigInteger.ONE;

		return BigInteger.valueOf(n).multiply(factorialWithRecursion(n - 1));

	}

	BigInteger factorialWithIteration(int n) {
		BigInteger value = BigInteger.ONE;
		for (int i = n; i >= 1; i--) {
			if (i != 1)
				value = value.multiply(BigInteger.valueOf(i));
		}

		return value;
	}

}

package com.esc.algopractice;

public class Recursion {
	
	int sumOfArray(int[] arr, int n) {
		if (n==1) return arr[0];
		int value = sumOfArray(arr, n-1); // Recurse on all but last element
		return value + arr[n-1]; // Add last element
	}
	
	int sumOfDigits(int n) {
		if (n==0 || n<0) return 0; // Base case + unconditional case
		return n%10 + sumOfDigits(n/10); // Recursive case
	}
	
	int power(int base, int exp) {
		if (exp < 0) return -1;
		if (exp == 0) return 1;
		return base * power(base, exp-1);
	}
	
	int factorial(int n) {
		if (n<0) return -1;
		if (n==0) return 1;
		return n*factorial(n-1);
	}
	
	int gcd(int a, int b) {
		if (a<0 || b <0) return -1; // Unintentional case
		if (b == 0) return a; // Base case
		return gcd(b, a%b); // Recursive case
	}
	
	int decimalToBinary(int n) {
		if (n == 0) return 0;
		return n%2 + 10*decimalToBinary(n/2);
	}
	
	int productofArray(int arr[], int n) {
		if (n==1) return arr[0];
		return arr[n-1] * productofArray(arr, n-1);
	}
	
	public static void main(String[] args) {
		Recursion main = new Recursion();
		System.out.println(main.sumOfDigits(3564));
		System.out.println(main.power(3,5));
		System.out.println(main.factorial(3));
		System.out.println(main.gcd(48,12));
		System.out.println(main.decimalToBinary(13));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(main.productofArray(arr, arr.length));
	}

}

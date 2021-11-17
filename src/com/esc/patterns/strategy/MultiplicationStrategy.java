package com.esc.patterns.strategy;

public class MultiplicationStrategy implements Strategy {

	@Override
	public void execute(int a, int b) {
		System.out.println(a*b);
	}

}

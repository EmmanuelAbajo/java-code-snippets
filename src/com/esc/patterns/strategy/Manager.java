package com.esc.patterns.strategy;

public class Manager {
	
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute(int a, int b) {
		this.strategy.execute(a, b);
	}

}

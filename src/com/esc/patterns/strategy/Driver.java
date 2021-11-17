package com.esc.patterns.strategy;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setStrategy(new AdditionStrategy());
		manager.execute(2, 3);
		
		manager.setStrategy(new MultiplicationStrategy());
		manager.execute(2, 3);
	}

}

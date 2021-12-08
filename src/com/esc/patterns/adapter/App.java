package com.esc.patterns.adapter;

public class App {
	
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		Vehicle bicycle =  new BicycleAdapter(new Bicycle());
		
		car.accelerate();
		truck.accelerate();
		bicycle.accelerate();
	}

}

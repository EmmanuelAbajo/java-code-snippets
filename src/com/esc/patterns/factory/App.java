package com.esc.patterns.factory;

public class App {

	public static void main(String[] args) {
		Car car = CarFactory.getCar(CarType.TOYOTA);
		car.move();
	}

}

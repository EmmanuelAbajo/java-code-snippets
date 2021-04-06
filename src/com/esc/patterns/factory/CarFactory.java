package com.esc.patterns.factory;

public class CarFactory {
	
	static Car getCar(CarType carType) {
		if (carType == CarType.TOYOTA) {
			return new Toyota();
		} else if (carType == CarType.VOLVO) {
			return new Volvo();
		}
		return null;
	}

}

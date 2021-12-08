package com.esc.patterns.adapter;

public class BicycleAdapter implements Vehicle {

	private Bicycle bicycle;

	public BicycleAdapter(Bicycle bicycle) {
		super();
		this.bicycle = bicycle;
	}

	@Override
	public void accelerate() {
		bicycle.go();

	}

}

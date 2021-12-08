package com.esc.patterns.command;

public class TurnOnCommand implements Command {

	// Composition
	private Light light;

	public TurnOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.turnOn();
	}

}

package com.esc.patterns.command;

public class App {

	public static void main(String[] args) {
		Switch switcher = new Switch();
		
		Light light = new Light();
		TurnOnCommand onCommand = new TurnOnCommand(light);
		TurnOffCommand offCommand = new TurnOffCommand(light);
		
		switcher.addCommand(onCommand);
		switcher.addCommand(offCommand);
		
		switcher.executeCommands();
	}

}

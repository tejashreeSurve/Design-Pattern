package com.bridgelabz.designpattern.factorypattern;

public class CarOperatingFactory {
	public Cars getObject(String string) {
		// return alto object
		if (string.equals("alto"))
			return new Alto();
		// return bmw object
		else if (string.equals("bmw"))
			return new BMW();
		// return tata motors
		else
			return new TataMotors();
	}
}

package com.bridgelabz.designpattern.factorypattern.example;

import com.bridgelabz.designpattern.factorypattern.CarOperatingFactory;
import com.bridgelabz.designpattern.factorypattern.Cars;

public class Factory {
	public static void main(String[] args) {
		CarOperatingFactory object = new CarOperatingFactory();
		// pass the string of tata motor
		Cars cars = object.getObject("tatamotor");
		cars.specification();
		cars.colour();
		cars.name();
	}
}

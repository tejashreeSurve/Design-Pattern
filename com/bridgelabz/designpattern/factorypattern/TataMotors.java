package com.bridgelabz.designpattern.factorypattern;

public class TataMotors implements Cars {

	@Override
	public void specification() {
		System.out.println("This is TataMotors Car");
	}

	@Override
	public void name() {
		System.out.println("TataMotors");
	}

	@Override
	public void colour() {
		System.out.println("Grey");
	}
}

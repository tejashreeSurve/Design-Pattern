package com.bridgelabz.designpattern.factorypattern;

public class BMW implements Cars {

	@Override
	public void specification() {
		System.out.println("This is Bmw Car");
	}

	@Override
	public void name() {
		System.out.println("BMW");
	}

	@Override
	public void colour() {
		System.out.println("white");
	}
}

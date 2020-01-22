package com.bridgelabz.designpattern.facadepattern;

public class HotelManager {
	// hotel manager contain every type of menu
	// creating reference of hotel interface
	public Hotel vegMenu;
	public Hotel nonVegMenu;
	public Hotel bothNonVeg;

	// using constructor we create object of every menu type classes
	public HotelManager() {
		vegMenu = new VegMenu();
		nonVegMenu = new NonVeg();
		bothNonVeg = new BothNonVeg();
	}

	// by calling that object we call the method of that class
	public void nonVegMenu() {
		nonVegMenu.typeOfMenu();
	}

	public void vegMenu() {
		vegMenu.typeOfMenu();
	}

	public void bothNonVeg() {
		bothNonVeg.typeOfMenu();
	}
}

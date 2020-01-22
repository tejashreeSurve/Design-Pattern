package com.bridgelabz.designpattern.facadepattern;

public class HotelFacade {
	public static void main(String[] args) {
		// we will call hotelManger who is facade
		HotelManager manager = new HotelManager();
		// depending upon customer requirement he will call
		// for both non-veg menu
		manager.bothNonVeg();
		// for veg menu
		manager.vegMenu();
		// for non-veg menu
		manager.nonVegMenu();
	}
}

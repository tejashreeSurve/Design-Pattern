package com.bridgelabz.designpattern.adapterpattern;

public class School {
	public static void main(String[] args) {
		// call object of adapter class
		PenAdapter adapter = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		// Set object of adapter class to pen interface
		aw.setP(adapter);
		aw.writeAssignment("assignment is done");
	}
}

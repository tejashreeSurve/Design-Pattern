package com.bridgelabz.designpattern.mediatorpattern;

public class MediatorClass {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User jhon = new User("jhon");
		// sending message to mediator
		robert.sendMessage("hello !jhon", "jhon");
		jhon.sendMessage("hello! robert", "robert");
	}
}

package com.bridgelabz.designpattern.mediatorpattern;

public class User {
	String name;
	String reciver;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendMessage(String message, String reciver) {
		ChatRoom.message(this, reciver, message);
	}
}

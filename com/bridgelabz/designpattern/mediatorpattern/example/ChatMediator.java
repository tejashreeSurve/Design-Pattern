package com.bridgelabz.designpattern.mediatorpattern.example;

public interface ChatMediator {
	public void sendMessage(String msg, User user);

	void addUser(User user);
}

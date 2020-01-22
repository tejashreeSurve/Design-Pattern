package com.bridgelabz.designpattern.mediatorpattern.example;

public class ChatClient {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "pankaj");
		User user2 = new UserImpl(mediator, "lisa");
		User user3 = new UserImpl(mediator, "saurabh");
		User user4 = new UserImpl(mediator, "david");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("hi all");
	}
}

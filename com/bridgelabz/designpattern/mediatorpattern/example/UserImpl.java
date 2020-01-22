package com.bridgelabz.designpattern.mediatorpattern.example;

public class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	public void send(String msg) {
		System.out.println(this.name + ": sending message=" + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void revice(String msg) {
		System.out.println(this.name + ":Recived message:" + msg);

	}
}

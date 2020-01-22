package com.bridgelabz.designpattern.mediatorpattern.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	private List<User> users;

	public ChatMediatorImpl() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User u : this.users) {
			if (u != user) {
				u.revice(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {

		this.users.add(user);
	}
}

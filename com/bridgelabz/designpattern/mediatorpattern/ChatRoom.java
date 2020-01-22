package com.bridgelabz.designpattern.mediatorpattern;

public class ChatRoom {
	public static void message(User user, String reciver, String message) {
		System.out.println("[" + user.getName() + "--->" + reciver + "]" + message);
	}
}

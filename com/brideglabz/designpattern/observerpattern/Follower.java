package com.brideglabz.designpattern.observerpattern;

public class Follower {
	String name;
	private PersonAccount account = new PersonAccount();

	public Follower(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println("hello  " + name + ",  new notification:" + account.title);
	}

	public void personTofollow(PersonAccount pa) {
		account = pa;
	}
}

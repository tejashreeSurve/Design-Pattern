package com.brideglabz.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class PersonAccount {
	private List<Follower> follower = new ArrayList<>();
	String title;

	public void follow(Follower f) {
		follower.add(f);
	}

	public void unFollow(Follower f) {
		follower.remove(f);
	}

    // Provide notification two every follower
	public void notification() {
		for (Follower follow : follower) {
			follow.update();
		}
	}

	public void upload(String title) {
		this.title = title;
		notification();
	}
}

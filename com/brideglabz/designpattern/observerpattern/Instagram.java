package com.brideglabz.designpattern.observerpattern;

public class Instagram {
public static void main(String[] args) {
	PersonAccount tejashree= new PersonAccount();
	// Adding followers 
	Follower follower1=new Follower("sayali");
	Follower follower2=new Follower("tanvi");
	Follower follower3=new Follower("shivani");
	Follower follower4=new Follower("rasika");
	tejashree.follow(follower1);
	tejashree.follow(follower2);
	tejashree.follow(follower3);
	tejashree.follow(follower4);
	// person to follow
	follower1.personTofollow(tejashree);
	follower2.personTofollow(tejashree);
	follower3.personTofollow(tejashree);
	follower4.personTofollow(tejashree);
	tejashree.upload("new image is uploaded");
}
}

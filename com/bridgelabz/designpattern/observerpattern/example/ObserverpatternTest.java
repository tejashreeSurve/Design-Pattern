package com.bridgelabz.designpattern.observerpattern.example;

public class ObserverpatternTest {
	public static void main(String[] args) {
		MyTopic topic = new MyTopic();
		Observer obj1 = new MyTopicSubscriber("obj1");
		Observer obj2 = new MyTopicSubscriber("obj2");
		Observer obj3 = new MyTopicSubscriber("obj3");
		topic.regrister(obj1);
		topic.regrister(obj2);
		topic.regrister(obj3);
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		obj1.update();
		topic.postMessage("new message");
	}
}

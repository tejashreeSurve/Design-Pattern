package com.bridgelabz.designpattern.observerpattern.example;

public interface Subject {
	public void regrister(Observer obj);

	public void unregister(Observer obj);

	public void notifyObserver();

	public Object getUpdate(Observer obj);
}

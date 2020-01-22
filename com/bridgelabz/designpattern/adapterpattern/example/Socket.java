package com.bridgelabz.designpattern.adapterpattern.example;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}

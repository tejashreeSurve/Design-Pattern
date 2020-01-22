package com.bridgelabz.designpattern.adapterpattern.example;

public class AdapterPatternTest {
public static void main(String[] args) {
	testClassAdapter();
	testObjectAdapter();
}
private static void testObjectAdapter() {
	SocketAdapter sockAdapter= new SocketObjectAdapterImpl();
	Volt v3=getVolt(sockAdapter, 3);
	Volt v12=getVolt(sockAdapter, 12);
	Volt v120=getVolt(sockAdapter, 120);
	System.out.println("v3 volts using object Adapter="+v3.getVolts());
	System.out.println("v12 volts using object Adapter="+v12.getVolts());
	System.out.println("v120 volts using object Adapter="+v120.getVolts());
}
private static void testClassAdapter() {
	SocketAdapter socketAdapter= new SocketClassAdpaterImpl();
	Volt v3=getVolt(socketAdapter, 3);
	Volt v12=getVolt(socketAdapter, 12);
	Volt v120=getVolt(socketAdapter, 120);
	System.out.println("v3 volts using class Adapter="+v3.getVolts());
	System.out.println("v12 volts using class Adapter="+v12.getVolts());
	System.out.println("v120 volts using class Adapter="+v120.getVolts());
}

private static Volt getVolt(SocketAdapter sockAdapter,int i) {
	switch(i) {
	case 3:return sockAdapter.get3Volt();
	case 12:return sockAdapter.get12Volt();
	case 120:return sockAdapter.get120Volt();
	default:return sockAdapter.get120Volt();
	}
}
}

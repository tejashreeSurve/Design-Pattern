package com.bridgelabz.designpattern.adapterpattern;

public class PenAdapter implements Pen {
	// create object of unrelated pilotPen 
	PilotPen obj= new PilotPen();
	@Override
	public void writeUsingpen(String string) {
		obj.mark(string);
	}

}

package com.bridgelabz.designpattern.prototypepattern;

public class BookController {
	public static void main(String[] args) throws CloneNotSupportedException {
		AddressBook obj = new AddressBook();
		obj.setBookId(1);
		obj.loadData();
		// here we are cloning the object 1 with object 2
		AddressBook obj1 = obj.clone();
		obj1.setBookId(2);
		System.out.println(obj1);
		// changing the value of object 1
		obj.getList().remove(0);
		System.out.println(obj);
	}
}

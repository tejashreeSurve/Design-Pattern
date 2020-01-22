package com.bridgelabz.designpattern.visitorpattern;

public class ShoppingCartClient {
	public static void main(String[] args) {
		ItemsType[] items = new ItemsType[] { new Books(1000, "book1"), new Books(1400, "book2"),
				new Fruits("apple", 120, 1), new Fruits("orange", 40, 1) };
		int totalPrice = totalCost(items);
		System.out.println("total cost:" + totalPrice);
	}

	public static int totalCost(ItemsType[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemsType value : items) {
			sum = sum + value.accept(visitor);
		}
		return sum;
	}
}

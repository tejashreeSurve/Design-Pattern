package com.bridgelabz.designpattern.visitorpattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Books book) {
		int cost = 0;
		if (book.getPrice() > 1000) {
			cost = book.getPrice() - 200;
		} else {
			cost = book.getPrice();
		}
		System.out.println("BookPrice: BookName:" + book.getIsbnumber() + ",BookPrice: " + cost);
		return cost;
	}

	@Override
	public int visit(Fruits fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("FruitName: " + fruit.getName() + " ," + "FruitPrice: " + cost);
		return cost;
	}
}

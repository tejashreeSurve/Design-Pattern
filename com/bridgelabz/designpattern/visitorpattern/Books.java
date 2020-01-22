package com.bridgelabz.designpattern.visitorpattern;

public class Books implements ItemsType {
	private int price;
	private String isbnumber;

	public Books(int price, String isbnumber) {
		this.price = price;
		this.isbnumber = isbnumber;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnumber() {
		return isbnumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {

		return visitor.visit(this);
	}
}

package com.bridgelabz.designpattern.visitorpattern;

public interface ItemsType {
	int accept(ShoppingCartVisitor visitor);
}

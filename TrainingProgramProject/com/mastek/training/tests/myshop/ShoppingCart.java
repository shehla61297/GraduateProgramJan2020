package com.mastek.training.tests.myshop;
//using generic type interface 
//Type<I>: I would be defined at usage time with type of class

public interface ShoppingCart<I> {
	public int addItem(I i);
	public int removeItem(I i);
	public void printItems();
	public double getTotalPrice(double taxPercentage, double discountPercentage);
}

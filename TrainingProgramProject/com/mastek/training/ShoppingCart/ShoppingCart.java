package com.mastek.training.ShoppingCart;


public class ShoppingCart {
	
	private String ItemName;
	private int NumberOfItems;
	private double UnitPrice;
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getNumberOfItems() {
		return NumberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		NumberOfItems = numberOfItems;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

}

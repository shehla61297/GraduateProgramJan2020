package com.mastek.training.tests.myshop;

public class Item 
implements Comparable<Item> //it provides the default sorting for TreeSet
{
	
	private int ItemId;
	private String ItemName;
	private int ItemQuantity;
	private double UnitPrice;
	
	public Item(int ItemID, String ItemName, double UnitPrice, int ItemQuantity) {
		setItemId(ItemID);
		setItemName(ItemName);
		setUnitPrice(UnitPrice);
		setItemQuantity(ItemQuantity);

	}
	public Item(int ItemId) {
		setItemId(ItemId);
	}
	
		
	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", ItemName=" + ItemName + ", ItemQuantity=" + ItemQuantity + ", UnitPrice="
				+ UnitPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ItemId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (ItemId != other.ItemId)
			return false;
		return true;
	}

	
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getItemQuantity() {
		return ItemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		ItemQuantity = itemQuantity;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	//TreeSet uses compareTo for default order
	@Override
	public int compareTo(Item anotherItem) {
		// return a number
		//+ve: current object greater than anotherItem
		//0: current object is equal to anotherItem
		//-ve: current object is less than anotherItem
		//System.out.println("Comparing Items");
		return this.getItemId()-anotherItem.getItemId();
		//we all need to compare the unique/key values for managing order
		
	}
	
	
	

}

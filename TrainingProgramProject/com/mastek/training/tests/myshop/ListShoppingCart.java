package com.mastek.training.tests.myshop;
import java.util.LinkedList;
import java.util.List;

public class ListShoppingCart implements ShoppingCart<Item> {

	List<Item>Items;
	
	public ListShoppingCart() {
		Items = new LinkedList<Item>();
	
	}
	
	@Override
	public int addItem(Item i) {
		// TODO Auto-generated method stub
		Items.add(i);
		
		return Items.size();
	}

	@Override
	public int removeItem(Item i) {
		// TODO Auto-generated method stub
		System.out.println("Index of Item to be removed: "+Items.indexOf(i));
		Items.remove(i);
		return Items.size();
		
	}

	@Override
	public void printItems() {
		System.out.println("Items In Cart");
		for (Item Item : Items) {
			System.out.println(Item);
		}
		// TODO Auto-generated method stub
		

	}

	@Override
	public double getTotalPrice(double tax, double discountPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

}

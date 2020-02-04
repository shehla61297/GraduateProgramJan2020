package com.mastek.training.ShoppingCart;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.mastek.training.tests.myshop.Item;
import com.mastek.training.tests.myshop.ShoppingCart;

public class SetShoppingCart implements ShoppingCart<Item> {

	Set<Item>Items;
	
	public SetShoppingCart() {
		//using HashSet to manage unique items in random order
		//Items = new HashSet<>();//diamond operator with new keyword
			//new HashSet<>();
		//using TreeSet to store items in sorted order
		Items = new TreeSet<>();
	}

	@Override
	public int addItem(Item i) {
		Items.add(i);
		// TODO Auto-generated method stub
		return Items.size();
	}

	@Override
	public int removeItem(Item i) {
		Items.remove(i);
		// TODO Auto-generated method stub
		return Items.size();
	}

	@Override
	public void printItems() {
		// TODO Auto-generated method stub
		System.out.println("Items in Cart");
		for (Item Item : Items) {
			System.out.println(Item);
		}
	}

	@Override
	public double getTotalPrice(double taxPercentage, double discountPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

}

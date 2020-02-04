package com.mastek.training.tests.myshop;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapShoppingCart implements ShoppingCart<Item> {

	Map<Integer, Item> Items;
	public MapShoppingCart() {
		//Items = new HashMap<>();
		Items = new TreeMap<Integer, Item>();//TreeMap sorts all the enteries using the keys:: ItemId
		
	}
	@Override
	public int addItem(Item i) {
		// TODO Auto-generated method stub
		Items.put(i.getItemId(), i);
		return Items.size();
	}

	@Override
	public int removeItem(Item i) {
	Items.remove(i.getItemId());
		return Items.size();
	}

	@Override
	public void printItems() {
		System.out.println("Items in Cart");
		for (Integer ItemId: Items.keySet()){//get all the ketys from the map 
			Item i = Items.get(ItemId);//get the value from the map using the key
			System.out.println(i);
		}	
	}

	@Override
	public double getTotalPrice(double taxPercentage, double discountPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

}

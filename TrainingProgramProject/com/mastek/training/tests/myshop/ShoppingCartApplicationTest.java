package com.mastek.training.tests.myshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.training.ShoppingCart.SetShoppingCart;

class ShoppingCartApplicationTest {
	ShoppingCart<Item> sc;
@BeforeEach  

	void setUp() throws Exception {
		//sc = new ListShoppingCart(); List Example
		//sc = new SetShoppingCart();
		sc = new MapShoppingCart();//map example
}
@AfterEach
	void tearDown () throws Exception{
	sc= null;
}
@Test
void testShoppingCartAddItem() {
int size = sc.addItem(new Item(1, "Item 1 ", 233.01, 0 ));
assertEquals(1, size, "Item Added");

sc.printItems();
	}
@Test
void testShoppingCartRemoveItems() {
sc.addItem(new Item(1, "Item 1 ", 233.0, 1 ));
sc.addItem(new Item(2, "Item 2 ", 1233.0, 1 ));
sc.addItem(new Item(3, "Item 3 ", 2233.0, 1 ));

int size = sc.removeItem(new Item(2));
sc.printItems();

}
@Test
void testShoppingCartprintItems() {
	sc.addItem(new Item(4, "Item 4", 1233.0, 1));
	sc.addItem(new Item(4, "Item 4", 1233.0, 1));
	sc.addItem(new Item(2, "Item 2", 1233.0, 1));
	sc.addItem(new Item(1, "Item 1", 233.0, 1));
	sc.addItem(new Item(3, "Item 3", 2233.0, 1));
	sc.addItem(new Item(3, "Item 3", 2233.0, 1));
	
	sc.printItems();
	
}
}

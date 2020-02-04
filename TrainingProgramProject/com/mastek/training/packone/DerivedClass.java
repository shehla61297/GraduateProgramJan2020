package com.mastek.training.packone;

public class DerivedClass extends SimpleClass {
	public static void main(String[] args) {
		DerivedClass dc1 = new DerivedClass();
		//In the Derived class of the same package, we can access all the types of members of the class
		//except private 
		System.out.println(
			"Private: "+dc1.privateNumber+
			"\nDefault: "+dc1.defaultNumber+
			"\nProtected: "+dc1.protectedNumber+
			"\nPublic: "+dc1.publicNumber);
}}

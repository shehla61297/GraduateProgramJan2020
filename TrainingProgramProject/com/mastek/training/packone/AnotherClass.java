package com.mastek.training.packone;

public class AnotherClass {
	SimpleClass sc1 = new SimpleClass();{
	//In the same class we can access all the types of members of the class
	//Except private members
	System.out.println(
		"Private: "+sc1.privateNumber+
		"\nDefault: "+sc1.defaultNumber+
		"\nProtected: "+sc1.protectedNumber+
		"\nPublic: "+sc1.publicNumber);
}
}
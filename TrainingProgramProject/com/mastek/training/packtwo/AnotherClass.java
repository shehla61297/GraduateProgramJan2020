package com.mastek.training.packtwo;

import com.mastek.training.packone.SimpleClass;

public class AnotherClass {
	SimpleClass sc1 = new SimpleClass();{
	//In the another Class, of other package we can only access the public members of the class.
	//Except private members
	System.out.println(
		//"Private: "+sc1.privateNumber+
		//"\nDefault: "+sc1.defaultNumber+
		//"\nProtected: "+sc1.protectedNumber+
		"\nPublic: "+sc1.publicNumber);
}
}
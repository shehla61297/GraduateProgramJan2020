package com.mastek.training.packone;

public interface Shape {
//no constructor can be defined in interface
	//all variables are static and final 
	
	double PI= Math.PI;
	
	//all methods are abstract
	public double getArea();
	public double getPerimeter();
}

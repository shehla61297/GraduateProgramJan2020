package com.mastek.training.packone;
//a class can inherit from interface using implement 
//one class can implement more than one interfaces
//interfaces uses the class object for implementing its behaviours
//hence it is used frequently as it effectively saves additional number of objects
public class Rectangle  implements Shape{
	private int Breadth;
	private int Length;


	public void setBreadth(int breadth) {
		Breadth = breadth;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getLength() {
		return Length;
	}
	
	
	
	public int getBreadth() {
		return Breadth;
	}
	

	//overide all methods from implemented interface
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLength() * getBreadth();
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return getLength() + getLength() + getBreadth() + getBreadth();
	}
}

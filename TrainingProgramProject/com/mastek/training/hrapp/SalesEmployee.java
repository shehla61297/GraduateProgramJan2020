package com.mastek.training.hrapp;
//Each class specifies their base/parent class name using extend keyword
//if class does not have extends keyword it is by default inheriting java.lang.Object

public class SalesEmployee extends Employee {
	
		private long target;
		private double comission;
		
		public SalesEmployee() {
			//System.out.println("Example");
			//use super keyword to call the base class constructor from the child/derived class 
			//super constructor call must be the first line in the constructor
			super(7777, "SalesExample",99,Designations.OFFICER);
		System.out.println("Sales Employee Created");
		}
		
		//Method Overriding
		//We write the same method available in base class in child class with different or 
		//additional logic for processing the results
		@Override
		public double getNetSalary(int NoOfDays) {
		// TODO Auto-generated method stub
		return (super.getNetSalary(NoOfDays)+(super.getNetSalary(NoOfDays)*getComission()));
		}

		public long getTarget() {
			return target;
		}
		public void setTarget(long target) {
			this.target = target;
		}
		public double getComission() {
			return comission;
		}
		public void setComission(double comission) {
			this.comission = comission;
		}
}

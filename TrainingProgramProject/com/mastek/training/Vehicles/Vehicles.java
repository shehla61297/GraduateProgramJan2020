package com.mastek.training.Vehicles;

public class Vehicles {

	private String Make;
	private String Model;
	private Colour Colour;
	private FuelType FuelType;
	private TransmissionTypes TransmissionType;
	private double Price;
	private Condition Condition;
	
	public static double DAMAGED_DISCOUNT=0.6;
	public static double USED_DISCOUNT=0.8;
		
	
	
	public Vehicles(){
	}
		
	public Vehicles(String Make, String Model, Colour Colour, FuelType FuelType, TransmissionTypes TransmissionType, double Price, Condition Condition){
		System.out.println("Vehicle Default Constructor Called");
		
		this.setMake(Make);
		this.setModel(Model);
		this.setColour(Colour);
		this.setFuelType(FuelType);
		this.setTransmissionType(TransmissionType);
		this.setPrice(Price);
		this.setCondition(Condition);
		
		System.out.println("The Make is:"+getMake());
	}
	

	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Colour getColour() {
		return Colour;
	}
	public void setColour(Colour colour) {
		Colour = colour;
	}
	public FuelType getFuelType() {
		return FuelType;
	}
	public void setFuelType(FuelType fuelType) {
		FuelType = fuelType;
	}
	public TransmissionTypes getTransmissionType() {
		return TransmissionType;
	}
	public void setTransmissionType(TransmissionTypes transmissionType) {
		TransmissionType = transmissionType;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	public Condition getCondition() {
		return Condition;
	}

	public void setCondition(Condition condition) {
		Condition = condition;
	}
	public double getVehiclePrice() {
		if(getCondition()==Condition.New) {
			return getPrice();}
			else if(getCondition()==Condition.Used) {
				
				return getPrice()*USED_DISCOUNT;}
				else if (getCondition()==Condition.Damaged) {
				return getPrice()*DAMAGED_DISCOUNT;}
		return Price;
			}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Colour == null) ? 0 : Colour.hashCode());
		result = prime * result + ((Condition == null) ? 0 : Condition.hashCode());
		result = prime * result + ((FuelType == null) ? 0 : FuelType.hashCode());
		result = prime * result + ((Make == null) ? 0 : Make.hashCode());
		result = prime * result + ((Model == null) ? 0 : Model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((TransmissionType == null) ? 0 : TransmissionType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicles other = (Vehicles) obj;
		if (Colour != other.Colour)
			return false;
		if (Condition != other.Condition)
			return false;
		if (FuelType != other.FuelType)
			return false;
		if (Make == null) {
			if (other.Make != null)
				return false;
		} else if (!Make.equals(other.Make))
			return false;
		if (Model == null) {
			if (other.Model != null)
				return false;
		} else if (!Model.equals(other.Model))
			return false;
		if (Double.doubleToLongBits(Price) != Double.doubleToLongBits(other.Price))
			return false;
		if (TransmissionType != other.TransmissionType)
			return false;
		return true;
	}


	}

	
			
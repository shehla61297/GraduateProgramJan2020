package com.mastek.training.Vehicles;

public class VehicleCar extends Vehicles {
	private String NumberPlate;
	private int NumberOfDoors;
	private int NumberOfWheels;
	private int NumberOfSeats;
	private BootSize BootSize;

	public VehicleCar(){
		super("Toyota","m19",Colour.Silver,FuelType.Diesel,TransmissionTypes.Manual,15999.99, com.mastek.training.Vehicles.Condition.New);
		System.out.println("VehicleCar Created");
}

	public String getNumberPlate() {
		return NumberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		NumberPlate = numberPlate;
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

	public int getNumberOfWheels() {
		return NumberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		NumberOfWheels = numberOfWheels;
	}

	public int getNumberOfSeats() {
		return NumberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}

	public BootSize getBootSize() {
		return BootSize;
	}

	public void setBootSize(BootSize bootSize) {
		BootSize = bootSize;
	}
	
}


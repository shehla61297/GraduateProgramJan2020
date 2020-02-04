package com.mastek.training.Vehicles;

public class VehicleMotorbike extends Vehicles {
private Footrests Footrests;
private Handlebars Handlebars;
private String SeatType;
private MotorbikeType MotorbikeType;

public static double SPORT_DISCOUNT=0.75;
public static double TOURING_DISCOUNT=0.65;

public VehicleMotorbike() {
super("Vespa","m19",Colour.Silver,FuelType.Diesel,TransmissionTypes.Manual,7999.99, Condition.Used);
System.out.println("VehicleMotorbike Created");
}

public Footrests getFootrests() {
	return Footrests;
}

public void setFootrests(Footrests footrests) {
	Footrests = footrests;
}

public Handlebars getHandlebars() {
	return Handlebars;
}

public void setHandlebars(Handlebars handlebars) {
	Handlebars = handlebars;
}

public String getSeatType() {
	return SeatType;
}

public void setSeatType(String seatType) {
	SeatType = seatType;
}

public MotorbikeType getMotorbikeType() {
	return MotorbikeType;
}

public void setMotorbikeType(MotorbikeType motorbikeType) {
	MotorbikeType = motorbikeType;
}
public double getMotorbikePrice() {
	if(getMotorbikeType()==MotorbikeType.Standard) {
		return getVehiclePrice();}
		else if(getMotorbikeType()==MotorbikeType.Touring) {
			return getVehiclePrice()*TOURING_DISCOUNT;}
			else if (getMotorbikeType()==MotorbikeType.Sport) {
			return getVehiclePrice()*SPORT_DISCOUNT;}
	return getMotorbikePrice();
	
}
}

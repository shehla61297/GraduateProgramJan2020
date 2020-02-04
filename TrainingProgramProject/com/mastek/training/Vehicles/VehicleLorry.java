package com.mastek.training.Vehicles;

public class VehicleLorry extends Vehicles {
private VehicleLorrySize vehicleLorrySize;
private VehicleLorryTrunkSize vehicleLorryTrunkSize;
private VehicleLorryTrunkShape VehicleLorryTrunkShape;

public static double SPHERICAL_TRUNK_DISCOUNT=0.85;
public static double CUBOID_TRUNK_DISCOUNT=0.90;

public VehicleLorry() {
super("Volvo","xl123",Colour.Red,FuelType.Petrol,TransmissionTypes.Manual,18999.99, Condition.Damaged);
System.out.println("VehicleLorry Created");
}

public VehicleLorrySize getVehicleLorrySize() {
	return vehicleLorrySize;
}

public void setVehicleLorrySize(VehicleLorrySize vehicleLorrySize) {
	this.vehicleLorrySize = vehicleLorrySize;
}

public VehicleLorryTrunkSize getVehicleLorryTrunkSize() {
	return vehicleLorryTrunkSize;
}

public void setVehicleLorryTrunkSize(VehicleLorryTrunkSize vehicleLorryTrunkSize) {
	this.vehicleLorryTrunkSize = vehicleLorryTrunkSize;
}

public VehicleLorryTrunkShape getVehicleLorryTrunkShape() {
	return VehicleLorryTrunkShape;
}

public void setVehicleLorryTrunkShape(VehicleLorryTrunkShape vehicleLorryTrunkShape) {
	VehicleLorryTrunkShape = vehicleLorryTrunkShape;
}
public double getLorryPrice() {
	if(getVehicleLorryTrunkShape()==VehicleLorryTrunkShape.Spherical) {
			return getVehiclePrice()*SPHERICAL_TRUNK_DISCOUNT;}
			else if (getVehicleLorryTrunkShape()==VehicleLorryTrunkShape.Cuboid) {
			return getVehiclePrice()*CUBOID_TRUNK_DISCOUNT;}
	return getLorryPrice();
}}
	
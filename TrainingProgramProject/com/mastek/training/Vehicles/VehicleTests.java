package com.mastek.training.Vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTests {

	@Test
	public void testInventory() {
		Vehicles vh = new Vehicles();
		vh.setMake("Volvo");
		vh.setModel("xc90");
		vh.setColour(Colour.Black);
		vh.setFuelType(FuelType.Diesel);
		vh.setTransmissionType(TransmissionTypes.Manual);
		vh.setPrice(6999.99);
		vh.setCondition(Condition.Used);
		
		System.out.println(
				"\nMake: " +vh.getMake()+
				"\nModel: " +vh.getModel()+
				"\nColour: " +vh.getColour()+
				"\nFuel Type: " +vh.getFuelType()+
				"\nTransmission Type: " +vh.getTransmissionType()+
				"\nPrice: " +vh.getPrice()+
				"\nCondition: "+vh.getCondition()+
				"\nDiscounted Price:" +vh.getVehiclePrice()
				
					
				);}
		@Test
		public void TestCreateAndViewNewVehicle() {
		
		Vehicles vh1 = new Vehicles("Merc", "c63", Colour.White, FuelType.Petrol, TransmissionTypes.Manual,21000.99, Condition.Damaged);
		System.out.println(
				"\nMake: " +vh1.getMake()+
				"\nModel: " +vh1.getModel()+
				"\nColour: " +vh1.getColour()+
				"\nFuel Type: " +vh1.getFuelType()+
				"\nTransmission Type: " +vh1.getTransmissionType()+
				"\nPrice: " +vh1.getPrice()+
				"\nCondition: "+vh1.getCondition()+
				"\nDiscounted Price:" +vh1.getVehiclePrice()
				);
				
	}
		@Test
		public void TestVehicleCarObjectUsage() {
			VehicleCar vc1 = new VehicleCar();
			vc1.setModel("c16");
			vc1.setMake("Toyota");
			vc1.setColour(Colour.Silver);
			vc1.setFuelType(FuelType.Petrol);
			vc1.setTransmissionType(TransmissionTypes.Manual);
			vc1.setPrice(15999.99);
			vc1.setCondition(Condition.New);
			vc1.setNumberPlate("sH161yRX");
			vc1.setNumberOfDoors(4);
			vc1.setNumberOfSeats(5);
			vc1.setNumberOfWheels(4);
			vc1.setBootSize(BootSize.Medium);
			
			System.out.println(
					"\nMake: " +vc1.getMake()+
					"\nModel: " +vc1.getModel()+
					"\nColour: " +vc1.getColour()+
					"\nFuel Type: " +vc1.getFuelType()+
					"\nTransmission Type: " +vc1.getTransmissionType()+
					"\nPrice: " +vc1.getPrice()+
					"\nCondition: "+vc1.getCondition()+
					"\nNumber Plate: " +vc1.getNumberPlate()+
					"\nNumber Of Doors: "+vc1.getNumberOfDoors()+
					"\nNumber Of Seats:"+vc1.getNumberOfSeats()+
					"\nNumber Of Wheels: "+vc1.getNumberOfWheels()+
					"\nBoot Size: "+vc1.getBootSize()+
					"\nDiscounted Price:" +vc1.getVehiclePrice()
					
					);
					
			
			assertEquals(15999.99,vc1.getPrice(),"This is the wrong price");
			System.out.println("This is the wrong price");
			
		}
		
		@Test
		public void TestVehicleMotorbikeObjectUsage() {
			VehicleMotorbike vm1 = new  VehicleMotorbike();
			vm1.setModel("m19");
			vm1.setMake("Vespa");
			vm1.setColour(Colour.Silver);
			vm1.setFuelType(FuelType.Petrol);
			vm1.setTransmissionType(TransmissionTypes.Manual);
			vm1.setPrice(7999.99);
			vm1.setCondition(Condition.Used);
			vm1.setFootrests(Footrests.Footpegs);
			vm1.setHandlebars(Handlebars.LowDrag);
			vm1.setSeatType("Leather with Backrest");
			vm1.setMotorbikeType(MotorbikeType.Touring);
			
			System.out.println(
					"\nMake: " +vm1.getMake()+
					"\nModel: " +vm1.getModel()+
					"\nColour: " +vm1.getColour()+
					"\nFuel Type: " +vm1.getFuelType()+
					"\nTransmission Type: " +vm1.getTransmissionType()+
					"\nPrice: " +vm1.getPrice()+
					"\nCondition: "+vm1.getCondition()+
					"\nFootrests: "+vm1.getFootrests()+
					"\nHandlebars: "+vm1.getHandlebars()+
					"\nSeat Type: "+vm1.getSeatType()+
					"\nMotorbike Type: "+vm1.getMotorbikeType()+
					"\nDiscounted Price:" +vm1.getMotorbikePrice()
					);
					
			assertEquals(7999.99,vm1.getPrice(),"This is the wrong price");
			System.out.println("This is the wrong price for new Motorbike");
}
		@Test
		public void TestVehicleLorryObjectUsage() {
			VehicleLorry vl1 = new  VehicleLorry();
			vl1.setModel("xl123");
			vl1.setMake("Volvo");
			vl1.setColour(Colour.Red);
			vl1.setFuelType(FuelType.Petrol);
			vl1.setTransmissionType(TransmissionTypes.Manual);
			vl1.setPrice(18999.99);
			vl1.setCondition(Condition.Damaged);
			vl1.setVehicleLorrySize(VehicleLorrySize.Small);
			vl1.setVehicleLorryTrunkSize(VehicleLorryTrunkSize.Small);
			vl1.setVehicleLorryTrunkShape(VehicleLorryTrunkShape.Spherical);
			
			System.out.println(
					"\nMake: " +vl1.getMake()+
					"\nModel: " +vl1.getModel()+
					"\nColour: " +vl1.getColour()+
					"\nFuel Type: " +vl1.getFuelType()+
					"\nTransmission Type: " +vl1.getTransmissionType()+
					"\nPrice: " +vl1.getPrice()+
					"\nCondition: "+vl1.getCondition()+
					"\nLorry Size: "+vl1.getVehicleLorrySize()+
					"\nLorry Trunk Size: "+vl1.getVehicleLorryTrunkSize()+
					"\nLorry Trunk Shape: "+vl1.getVehicleLorryTrunkShape()+
					"\nDiscounted Price:" +vl1.getLorryPrice()
					);
					
			assertEquals(18999.99,vl1.getPrice(),"This is the wrong price");
			System.out.println("This is the wrong price for this type of vehicle");
}
		@Test
		void testObjectFeaturesOnVehicles() {
			System.out.println("<====Object Features Start====>");
			
			System.out.println(toString());
			System.out.println("HashCode:" +hashCode());
			
			System.out.println("<====Object Features End====>");
		
				}}

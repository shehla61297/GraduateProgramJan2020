package com.mastek.training.Train;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.Train.TrainTickets;
import com.mastek.training.basics.PassengerType;

class TrainTest {
	@Test
	void testCreateAndViewTrainTickets() {
		TrainTickets ti1 = new TrainTickets();
		ti1.setDepartureStation("Leeds");
		ti1.setArrivalStation("Dewsbury");
		ti1.setPricePerPassenger(10);
		ti1.setPassengerType(PassengerType.Adult);
		ti1.setNumberOfPassengers(3);
		System.out.println(
				"\nDeparture Station: "+ti1.getDepartureStation()+
				"\nArrival Station: "+ti1.getArrivalStation()+
				"\nPrice Per Passenger:"+ti1.getPricePerPassenger()+
				"\nPassenger Type:"+ti1.getPassengerType()+
				"\nNumber of Passengers:"+ti1.getNumberOfPassengers()+
				"\nNet Ticket Price= " +ti1.getNetTicketPrice()
				);


		
				
	}

	
	

}

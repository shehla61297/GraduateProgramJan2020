package com.mastek.training.Train;

import com.mastek.training.basics.PassengerType;

public class TrainTickets {

	private String DepartureStation;
	private String ArrivalStation;
	private double PricePerPassenger;
	private PassengerType PassengerType;
	private int NumberOfPassengers;
	
	public static final int MAX_NUMBER_OF_PASSENGERS=5;
	public static final int MIN_NUMBER_OF_PASSENGERS=1;
	
			
	
	public double getPricePerPassenger() {
		return PricePerPassenger;
	}
	public void setPricePerPassenger(double pricePerPassenger) {
		PricePerPassenger = pricePerPassenger;
	}
	public int getNumberOfPassengers() {
		return NumberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		if(NumberOfPassengers<MAX_NUMBER_OF_PASSENGERS || NumberOfPassengers >= MIN_NUMBER_OF_PASSENGERS) {
		NumberOfPassengers = numberOfPassengers;}
		else if(numberOfPassengers> MAX_NUMBER_OF_PASSENGERS) {
			NumberOfPassengers = 0;}
		else if (numberOfPassengers <MIN_NUMBER_OF_PASSENGERS) {
			NumberOfPassengers =0;
		}
		}

	public String getDepartureStation() {
		return DepartureStation;
	}
	public void setDepartureStation(String departureStation) {
		DepartureStation = departureStation;
	}
	public String getArrivalStation() {
		return ArrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		ArrivalStation = arrivalStation;
	
	}
	public PassengerType getPassengerType() {
		return PassengerType;
	}
	public void setPassengerType(PassengerType passengerType) {
		this.PassengerType = passengerType;
	}
	public double getNetTicketPrice() {
		if(getPassengerType()==PassengerType.Child) {
			PricePerPassenger = PricePerPassenger/2;}
			return getPricePerPassenger() * NumberOfPassengers;
	}}
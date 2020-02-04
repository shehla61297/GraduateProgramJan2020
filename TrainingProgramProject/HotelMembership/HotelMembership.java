package HotelMembership;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class HotelMembership {

	private int HotelMembershipNumber;
	private String LengthOfMembership;
	private String MemberName;
	private String MemberDateOfBirth;
	private RoomType RoomType;
	private int NumberOfBeds;
	private int RoomPrice;
	private int NumberOfDays;
	private int NumberOfRoomsBooked;
	
	public static double TAX=1.17;
	public static double MULTIPLE_ROOM_DISCOUNT = 0.85;
	
	public int getNumberOfRoomsBooked() {
		return NumberOfRoomsBooked;
	}
	public void setNumberOfRoomsBooked(int numberOfRoomsBooked) {
		NumberOfRoomsBooked = numberOfRoomsBooked;
	}
	
	public int getHotelMembershipNumber() {
		return HotelMembershipNumber;
	}
	public void setHotelMembershipNumber(int hotelMembershipNumber) {
		HotelMembershipNumber = hotelMembershipNumber;
	}
	public String getLengthOfMembership() {
		return LengthOfMembership;
	}
	public void setLengthOfMembership(String lengthOfMembership) {
		LengthOfMembership = lengthOfMembership;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getMemberDateOfBirth() {
		return MemberDateOfBirth;
	}
	public void setMemberDateOfBirth(String memberDateOfBirth) {
		MemberDateOfBirth = memberDateOfBirth;
	}
	public RoomType getRoomType() {
		return RoomType;
	}
	public void setRoomType(RoomType roomType) {
		RoomType = roomType;
	}
	public int getNumberOfBeds() {
		return NumberOfBeds;
	}
	public void setNumberOfBeds(int numberOfBeds) {
		NumberOfBeds = numberOfBeds;
	}
	public int getRoomPrice() {
		return RoomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		RoomPrice = roomPrice;
	}
	public int getNumberOfDays() {
		return NumberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		NumberOfDays = numberOfDays;
	}
	
	public double getPricePreTax() {
		return getNumberOfDays()*getRoomPrice();
				
	}
	
	public double getPriceAfterTax() {
	return getPricePreTax()*TAX;
	}
	
	public double getMultipleBookingDiscount() {
		if(getNumberOfRoomsBooked() > 1)
			return getPriceAfterTax()*MULTIPLE_ROOM_DISCOUNT;
		else if(getNumberOfRoomsBooked()<= 1)
			return getPriceAfterTax();
		return getMultipleBookingDiscount();
		
	}}
	
	
	
	

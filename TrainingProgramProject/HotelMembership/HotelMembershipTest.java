package HotelMembership;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.Vehicles.Colour;
import com.mastek.training.Vehicles.Condition;
import com.mastek.training.Vehicles.FuelType;
import com.mastek.training.Vehicles.TransmissionTypes;
import com.mastek.training.Vehicles.Vehicles;

class HotelMembershipTest {

	@Test
	public void testHotelMembership() {
		HotelMembership hm1 = new HotelMembership();
		hm1.setHotelMembershipNumber(1111);
		hm1.setMemberName("Shehla Jahangir");
		hm1.setLengthOfMembership("6 Months");
		hm1.setMemberDateOfBirth("18/08/1995");
		hm1.setNumberOfBeds(2);
		hm1.setNumberOfDays(5);
		hm1.setRoomType(RoomType.Double);
		hm1.setRoomPrice(80);
		hm1.setNumberOfRoomsBooked(2);
		
		System.out.println(
				"\nHotel Membership Number: "+hm1.getHotelMembershipNumber()+
				"\nHotel Member Name: "+hm1.getMemberName()+
				"\nMembership Length: "+hm1.getLengthOfMembership()+
				"\nDate of Birth: "+hm1.getMemberDateOfBirth()+
				"\nNumber of Beds: "+hm1.getNumberOfBeds()+
				"\nNumber of Days: "+hm1.getNumberOfDays()+
				"\nRoom Type: "+hm1.getRoomType()+
				"\nRoom Price Per Night: "+hm1.getRoomPrice()+
				"\nPrice Pre Tax: "+hm1.getPricePreTax()+
				"\nPrice Post Tax: "+hm1.getPriceAfterTax()+
				"\nPrice after Discount: "+hm1.getMultipleBookingDiscount()
				
				
				);}
		

					
@Test
public void testHotelMembershipBronze() {
	HotelMembershipBronze hb1 = new HotelMembershipBronze();
	hb1.setHotelMembershipNumber(1112);
	hb1.setMemberName("Shell Jahangir");
	hb1.setLengthOfMembership("10 Months");
	hb1.setMemberDateOfBirth("17/08/1995");
	hb1.setNumberOfBeds(1);
	hb1.setNumberOfDays(3);
	hb1.setRoomType(RoomType.King);
	hb1.setRoomPrice(104);
	hb1.setNumberOfRoomsBooked(2);
	hb1.setDigitalCheckIn(DigitalCheckIn.Yes);
	hb1.setFreeBeverage(FreeBeverage.SoftDrink);
	hb1.setBronzeMembership(BronzeMembership.Yes);
	
	
	System.out.println(
			"\nHotel Membership Number: "+hb1.getHotelMembershipNumber()+
			"\nHotel Member Name: "+hb1.getMemberName()+
			"\nMembership Length: "+hb1.getLengthOfMembership()+
			"\nDate of Birth: "+hb1.getMemberDateOfBirth()+
			"\nNumber of Beds: "+hb1.getNumberOfBeds()+
			"\nNumber of Days: "+hb1.getNumberOfDays()+
			"\nRoom Type: "+hb1.getRoomType()+
			"\nRoom Price Per Night: "+hb1.getRoomPrice()+
			"\nPrice Pre Tax: "+hb1.getPricePreTax()+
			"\nPrice Post Tax: "+hb1.getPriceAfterTax()+
			"\nPrice after Discount per Room: "+hb1.getBronzeMembershipDiscount()+
			"\nDigital Check In: "+hb1.getDigitalCheckIn()+
			"\nFree Beverage: "+hb1.getFreeBeverage()+
			"\nBronze Membership: "+hb1.getBronzeMembership());
			
}

@Test
public void testHotelMembershipSilver() {
	SilverMembership hs1 = new SilverMembership();
	hs1.setHotelMembershipNumber(1112);
	hs1.setMemberName("Shell Jahangir");
	hs1.setLengthOfMembership("10 Months");
	hs1.setMemberDateOfBirth("17/08/1995");
	hs1.setNumberOfBeds(1);
	hs1.setNumberOfDays(3);
	hs1.setRoomType(RoomType.King);
	hs1.setRoomPrice(104);
	hs1.setNumberOfRoomsBooked(2);
	hs1.setSilverMembershipApplicable(SilverMembershipApplicable.Yes);
	hs1.setFreeWifi(FreeWifi.Yes);
	
	
	
	
	System.out.println(
			"\nHotel Membership Number: "+hs1.getHotelMembershipNumber()+
			"\nHotel Member Name: "+hs1.getMemberName()+
			"\nMembership Length: "+hs1.getLengthOfMembership()+
			"\nDate of Birth: "+hs1.getMemberDateOfBirth()+
			"\nNumber of Beds: "+hs1.getNumberOfBeds()+
			"\nNumber of Days: "+hs1.getNumberOfDays()+
			"\nRoom Type: "+hs1.getRoomType()+
			"\nRoom Price Per Night: "+hs1.getRoomPrice()+
			"\nPrice Pre Tax: "+hs1.getPricePreTax()+
			"\nPrice Post Tax: "+hs1.getPriceAfterTax()+
			"\nPrice after Discount per Room: "+hs1.getSilverMembershipDiscountPrice()
			);

}
@Test
public void testHotelMembershipGold() {
	GoldMembership hg1 = new GoldMembership();
	hg1.setHotelMembershipNumber(1112);
	hg1.setMemberName("Shell Jahangir");
	hg1.setLengthOfMembership("10 Months");
	hg1.setMemberDateOfBirth("17/08/1995");
	hg1.setNumberOfBeds(1);
	hg1.setNumberOfDays(3);
	hg1.setRoomType(RoomType.King);
	hg1.setRoomPrice(104);
	hg1.setNumberOfRoomsBooked(2);
	hg1.setGoldMembershipApplicable(GoldMembershipApplicable.Yes);
	hg1.setFreeSnacks(FreeSnacks.StreetFood);
	
	
	
	
	System.out.println(
			"\nHotel Membership Number: "+hg1.getHotelMembershipNumber()+
			"\nHotel Member Name: "+hg1.getMemberName()+
			"\nMembership Length: "+hg1.getLengthOfMembership()+
			"\nDate of Birth: "+hg1.getMemberDateOfBirth()+
			"\nNumber of Beds: "+hg1.getNumberOfBeds()+
			"\nNumber of Days: "+hg1.getNumberOfDays()+
			"\nRoom Type: "+hg1.getRoomType()+
			"\nRoom Price Per Night: "+hg1.getRoomPrice()+
			"\nPrice Pre Tax: "+hg1.getPricePreTax()+
			"\nPrice Post Tax: "+hg1.getPriceAfterTax()+
			"\nPrice after Discount per Room: "+hg1.getGoldMembershipDiscountPrice()
			);

}}
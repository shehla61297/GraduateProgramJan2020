package HotelMembership;

public class HotelMembershipBronze extends HotelMembership {
	private DigitalCheckIn DigitalCheckIn;
	private FreeBeverage FreeBeverage;
	private int NumberOfPointsCollected;
	private BronzeMembership BronzeMembership;
	
	private static double BRONZE_MEMBERSHIP_DISCOUNT=0.95;
	
	public int getNumberOfPointsCollected() {
		return NumberOfPointsCollected;
	}
	public void setNumberOfPointsCollected(int numberOfPointsCollected) {
		NumberOfPointsCollected = numberOfPointsCollected;
	}
	public DigitalCheckIn getDigitalCheckIn() {
		return DigitalCheckIn;
	}
	public void setDigitalCheckIn(DigitalCheckIn digitalCheckIn) {
		DigitalCheckIn = digitalCheckIn;
	}
	public FreeBeverage getFreeBeverage() {
		return FreeBeverage;
	}
	public void setFreeBeverage(FreeBeverage freeBeverage) {
		FreeBeverage = freeBeverage;
	}
	public BronzeMembership getBronzeMembership() {
		return BronzeMembership;
	}
	public void setBronzeMembership(BronzeMembership bronzeMembership) {
		BronzeMembership = bronzeMembership;
	}
	
	public double getBronzeMembershipDiscount() {
		if(getBronzeMembership()==BronzeMembership.Yes) {
			return getMultipleBookingDiscount()*BRONZE_MEMBERSHIP_DISCOUNT;
		}
		else if(getBronzeMembership()==BronzeMembership.No) {
				return getMultipleBookingDiscount();
	}
		return getBronzeMembershipDiscount();
	}}

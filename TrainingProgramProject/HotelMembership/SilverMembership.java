package HotelMembership;

public class SilverMembership extends HotelMembership {
	private SilverMembershipApplicable SilverMembershipApplicable;
	private FreeWifi FreeWifi;
	
	private static double SILVER_DISCOUNT=0.94;
	
			
	
	
	public SilverMembershipApplicable getSilverMembershipApplicable() {
		return SilverMembershipApplicable;
	}
	public void setSilverMembershipApplicable(SilverMembershipApplicable silverMembershipApplicable) {
		SilverMembershipApplicable = silverMembershipApplicable;
	
	}
	public FreeWifi getFreeWifi() {
		return FreeWifi;
	}
	public void setFreeWifi(FreeWifi freeWifi) {
		FreeWifi = freeWifi;
	}
	
	public double getSilverMembershipDiscountPrice() {
		if(getSilverMembershipApplicable()==SilverMembershipApplicable.Yes)
			return getMultipleBookingDiscount()*SILVER_DISCOUNT;
		else if(getSilverMembershipApplicable()==SilverMembershipApplicable.No)
			return getMultipleBookingDiscount();
		return getSilverMembershipDiscountPrice();
		
	}
	

};

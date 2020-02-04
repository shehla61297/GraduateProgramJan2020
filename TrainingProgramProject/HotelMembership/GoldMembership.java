package HotelMembership;

public class GoldMembership extends HotelMembership {
 private GoldMembershipApplicable GoldMembershipApplicable;
 private FreeSnacks FreeSnacks;
 
 private static double GOLD_DISCOUNT=0.93;

public GoldMembershipApplicable getGoldMembershipApplicable() {
	return GoldMembershipApplicable;
}

public void setGoldMembershipApplicable(GoldMembershipApplicable goldMembershipApplicable) {
	GoldMembershipApplicable = goldMembershipApplicable;
}

public FreeSnacks getFreeSnacks() {
	return FreeSnacks;
}

public void setFreeSnacks(FreeSnacks freeSnacks) {
	FreeSnacks = freeSnacks;
}
 
public double getGoldMembershipDiscountPrice() {
	if(getGoldMembershipApplicable()==GoldMembershipApplicable.Yes)
		return getMultipleBookingDiscount()*GOLD_DISCOUNT;
else if(getGoldMembershipApplicable()==GoldMembershipApplicable.No)
	return getMultipleBookingDiscount();
	return getGoldMembershipDiscountPrice();
	
	
}
 
}

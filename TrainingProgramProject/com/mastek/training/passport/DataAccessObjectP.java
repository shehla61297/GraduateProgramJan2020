package com.mastek.training.passport;

import java.util.Collection;

import com.mastek.training.passport.PassportApplication;



public interface DataAccessObjectP<P>{
	public P add(P newP);
	public Collection<PassportApplication> listAll();
	public P find(int key);
	public P remove(int key);

	

}

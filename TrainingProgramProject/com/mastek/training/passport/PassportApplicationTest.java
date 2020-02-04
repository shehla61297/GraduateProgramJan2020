package com.mastek.training.passport;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.training.passport.Sex;
//import com.mastek.training.passport.PassportApplicationMongoDAO;
import com.mastek.training.passport.DataAccessObjectP;
import com.mastek.training.passport.PassportApplication;



class PassportApplicationTest {
	DataAccessObjectP<PassportApplication> passDAO;
	


	@BeforeEach
	void setUp() throws Exception {
		passDAO = new PassportApplicationDAO();
		//passDAO = new PassportApplicationMongoDAO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test void testDisplayPassportDetails(){
		PassportApplication newPass = new PassportApplication();
		newPass.setPassport_id(1114);
		newPass.setFirstname("Shehla ");
		newPass.setSurname("Jahangir");
		newPass.setDob("18/08/1995");
		newPass.setNationality("British");
		newPass.setPlace_of_birth("UK");
		newPass.setSex(Sex.Female);
	
		System.out.println(
				   "Passport id: "+newPass.getPassport_id()+
		            "\n first name: "+newPass.getFirstname()+
		            "\n surname: "+newPass.getSurname()+
		            "\n date of birth: "+newPass.getDob()+
		            "\n nationality: "+newPass.getNationality()+
		            "\n place of birth: "+newPass.getPlace_of_birth()+
		            "\n sex: "+newPass.getSex());
		
	
		
		
	}*/
	

	
@Test 
void testAddNewPassportApplicationData(){
	PassportApplication newPass = new PassportApplication();
	newPass.setPassport_id(5555);
	newPass.setFirstname("S ");
	newPass.setSurname("Jahangir");
	newPass.setDob("21/08/1995");
	newPass.setNationality("British");
	newPass.setPlace_of_birth("France");
	newPass.setSex(Sex.Female);
	

newPass = passDAO.add(newPass);
assertNotNull("Application not added");


PassportApplication fetchPass = passDAO.find(5555);
assertNotNull(fetchPass, "Application not found");
	
System.out.println("Details Added");
}
@Test
void testListAllPassportApplication() {
	Collection<PassportApplication> passs = passDAO.listAll();
	for (PassportApplication passportApplication : passs) {
		System.out.println(passportApplication);
	}}
@Test
void testRemovePassportApplication() {
	PassportApplication newPass = new PassportApplication();
	newPass.setPassport_id(5556);
	newPass.setFirstname("Example");
	newPass.setSurname("Example");
	newPass.setDob("17/08/1995");
	newPass.setNationality("British");
	newPass.setPlace_of_birth("Germany");
	newPass.setSex(Sex.Female);
	

	newPass = passDAO.add(newPass); 
	assertNotNull(newPass, "Passport Application not added");
	
	PassportApplication removedPass = passDAO.remove(5556);
	assertNotNull(removedPass, "Passport Application Not Removed");
	
	PassportApplication checkRemovedPass = passDAO.find(5556);
	assertNull(checkRemovedPass, "Passport Application Not Removed");
	
}
}


		
		
		
		
	

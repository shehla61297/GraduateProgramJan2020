package com.mastek.training.passport;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.training.passport.Sex;
import com.mastek.training.passport.PassportApplicationMongoDAO;
import com.mastek.training.passport.DataAccessObjectP;
import com.mastek.training.passport.PassportApplication;


class PassportApplicationMongoTest {
	DataAccessObjectP<PassportApplication> passDAO;
	
		
	@BeforeEach
	void setUp() throws Exception {
		passDAO = new PassportApplicationMongoDAO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
void testAddNewPassportApplicationData(){
		PassportApplication newPass = new PassportApplication();
		newPass.setPassport_id(5559);
		newPass.setFirstname("S ");
		newPass.setSurname("Jahangir");
		newPass.setDob("21/08/1995");
		newPass.setNationality("British");
		newPass.setPlace_of_birth("France");
		newPass.setSex(Sex.Female);
		

	newPass = passDAO.add(newPass);
	
	PassportApplication fetchPass = passDAO.find(5559);
	assertNotNull(fetchPass, "Application not found");
		
	System.out.println("Details Added");
	}
	

@Test
void testListAllPassportApplication() {
	Collection<PassportApplication> passa = passDAO.listAll();
	for (PassportApplication passportApplication : passa) {
		System.out.println("Passport Application");
	}}
@Test
void testRemovePassportApplication() {
	PassportApplication newPass = new PassportApplication();
	newPass.setPassport_id(559);
	newPass.setFirstname("Example");
	newPass.setSurname("Example");
	newPass.setDob("17/08/1995");
	newPass.setNationality("British");
	newPass.setPlace_of_birth("Germany");
	newPass.setSex(Sex.Female);
	

	newPass = passDAO.add(newPass); 
	assertNotNull(newPass, "Passport Application not added");
	
	PassportApplication removedPass = passDAO.remove(559);
	assertNotNull(removedPass, "Passport Application Not Removed");
	
	PassportApplication checkRemovedPass = passDAO.find(559);
	assertNull(checkRemovedPass, "Passport Application Not Removed");
	
}
}



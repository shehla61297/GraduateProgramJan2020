package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.LinkedIn.Profile;

class LinkedInTest {

	@Test
	void testCreateAndViewProfile() {
		Profile li1 = new Profile();
		li1.setProfileName("Example");
		li1.setQualifications("Example");
		li1.setSkills("Example");
		li1.setCertifications("Example");
		li1.setJobDetails("Example");
		li1.setEmail("example@mail.com");
		System.out.println(
				"\nProfile Name: " +li1.getProfileName()+
				"\nQualifications " +li1.getQualifications()+
				"\nSkills: " +li1.getSkills()+
				"\nCertifications: "+li1.getCertifications()+
				"\nJob Details: " +li1.getJobDetails()+
				"\nEmail: " +li1.getEmail()
				);
	}

}

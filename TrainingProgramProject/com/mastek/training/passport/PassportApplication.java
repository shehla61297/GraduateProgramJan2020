package com.mastek.training.passport;

import org.bson.Document;

import com.mastek.training.passport.Sex;

public class PassportApplication {
	private int passport_id;
	private String firstname;
	private String surname;
	private String dob;
	private String nationality;
	private String place_of_birth;
	private Sex Sex;
	
	
	
		
	
	public int getPassport_id() {
		return passport_id;
	}
	public void setPassport_id(int passport_id) {
		this.passport_id = passport_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPlace_of_birth() {
		return place_of_birth;
	}
	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}
	public Sex getSex() {
		return Sex;
	}
	public void setSex(Sex sex) {
		this.Sex = sex;
	}

	
	public static Document getPassportApplicationFromMongoDocument(PassportApplication pass) {
		Document docPass = new Document();
		docPass.put("passport_id", pass.getPassport_id());
		docPass.put("firstname", pass.getFirstname());
		docPass.put("surname", pass.getSurname());
		docPass.put("dob", pass.getDob());
		docPass.put("nationality", pass.getNationality());
		docPass.put("place_of_birth", pass.getPlace_of_birth());
		docPass.put("sex", pass.getSex().toString());
	
		
		
		return docPass;}

	
	

	public static  PassportApplication getPassportApplicationFromMongoDocument(Document PassDoc) {
		PassportApplication pass = new PassportApplication();
		try {
			pass.setPassport_id(PassDoc.getInteger("passport_id"));
			pass.setFirstname(PassDoc.getString("firstname"));
			pass.setSurname(PassDoc.getString("surname"));
			pass.setDob(PassDoc.getString("dob"));
			pass.setNationality(PassDoc.getString("nationality"));
			pass.setPlace_of_birth(PassDoc.getString("place_of_birth"));
			pass.setSex(com.mastek.training.passport.Sex.valueOf(PassDoc.getString("sex")));
			
		
		
			
				
	
		}
		catch(Exception ex) {
			pass=null;
		}
		return pass;
	}}
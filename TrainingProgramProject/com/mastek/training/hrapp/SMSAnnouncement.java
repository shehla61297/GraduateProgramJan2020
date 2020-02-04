package com.mastek.training.hrapp;

public class SMSAnnouncement extends Announcement {
	//each derived class of the base abstract class must override all abstract methods from
	//the base/parent class

	@Override
	public void Announcement() {
		System.out.println("Sending SMS to:"+getForGroup() +" By"+getFrom()+" With Title: "+getSubject()+" and Text: "+getContentText());

	}
	



	}



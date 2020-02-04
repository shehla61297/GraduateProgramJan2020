package com.mastek.training.hrapp;

public class EmailAnnouncement extends Announcement {

	@Override
	public void Announcement() {
		System.out.println("Sending Email to:"+getForGroup() +" By"+getFrom()+" With Title: "+getSubject()+" and Text: "+getContentText());
	}

}

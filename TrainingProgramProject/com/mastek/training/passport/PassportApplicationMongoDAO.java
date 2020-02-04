package com.mastek.training.passport;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.bson.Document;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;


public class PassportApplicationMongoDAO implements DataAccessObjectP<PassportApplication>{

	MongoCollection<Document> passCollection;
	
	
	public PassportApplicationMongoDAO() {
		MongoClient client = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase db = client.getDatabase("graduate_2020_masteknet");
		passCollection = db.getCollection("PassApp");
		
	}
		



		@Override
		public PassportApplication add(PassportApplication newPassportApplication) {
			passCollection.insertOne(PassportApplication.getPassportApplicationFromMongoDocument(newPassportApplication));
			return newPassportApplication;
		}

		@Override
		public Collection<PassportApplication> listAll() {
			List<PassportApplication> passa = new LinkedList<PassportApplication>();
			
			for(Document PassDoc: passCollection.find()) {
				PassportApplication pass = PassportApplication.getPassportApplicationFromMongoDocument(PassDoc);
				
			
			}
			return passa;
				
	
	}


	

	@Override
	public PassportApplication find(int key) {
		return PassportApplication.getPassportApplicationFromMongoDocument(
				passCollection.find(new Document("passport_id",key)).first());
	}


	@Override
	public PassportApplication remove(int key) {
		PassportApplication removedPass = PassportApplication.getPassportApplicationFromMongoDocument(
				passCollection.find(new Document("passport_id",key)).first());
		if(removedPass!=null) {
			passCollection.deleteOne(new Document("passport_id",key));
		}
		
		return removedPass;
				
		
	

}}
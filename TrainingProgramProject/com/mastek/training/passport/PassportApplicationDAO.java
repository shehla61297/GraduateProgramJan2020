package com.mastek.training.passport;

import java.sql.Connection;
import java.util.Collection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.mastek.training.passport.Sex;
import com.mastek.training.passport.PassportApplication;


public class PassportApplicationDAO implements DataAccessObjectP<PassportApplication> {
	Connection conMysql;
	
	public PassportApplicationDAO() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conMysql = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/graduate_2020_masteknet",
					"root",
					"root");
			System.out.println("Connection Successful");
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public PassportApplication add(PassportApplication newPassportApplication) {
		String sqlInsert = "Insert into passport_application "
				+ "(passport_id, firstname, surname, dob, nationality, place_of_birth, sex) "
				+ "values (?,?,?,?,?,?,?)";
		try (PreparedStatement psInsert = conMysql.prepareStatement(sqlInsert)){
			psInsert.setInt(1, newPassportApplication.getPassport_id());
			psInsert.setString(2, newPassportApplication.getFirstname());
			psInsert.setString(3, newPassportApplication.getSurname());
			psInsert.setString(4, newPassportApplication.getDob());
			psInsert.setString(5, newPassportApplication.getNationality());
			psInsert.setString(6, newPassportApplication.getPlace_of_birth());
			psInsert.setString(7, newPassportApplication.getSex().toString());
			
			int recordsAffected = psInsert.executeUpdate();
			
			System.out.println(recordsAffected+ "Application Inserted");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			newPassportApplication=null;
			
		}
	
		return newPassportApplication;
	}

	@Override
	public Collection<PassportApplication> listAll() {
		String sqlSelectAll = "select * from passport_application";
		List<PassportApplication> passportApplication = new LinkedList<PassportApplication>();
		try(Statement stSelectAll = conMysql.createStatement()){
			ResultSet rsPassportApplication = stSelectAll.executeQuery(sqlSelectAll);
			while(rsPassportApplication.next()) {
				PassportApplication p = new PassportApplication();
				
				p.setPassport_id(rsPassportApplication.getInt("passport_id"));
				p.setFirstname(rsPassportApplication.getString("firstname"));
				p.setSurname(rsPassportApplication.getString("surname"));
				p.setDob(rsPassportApplication.getString("dob"));
				p.setNationality(rsPassportApplication.getString("nationality"));
				p.setPlace_of_birth(rsPassportApplication.getString("place_of_birth"));
				p.setSex(Sex.valueOf(rsPassportApplication.getString("sex")));
				
				
				
				passportApplication.add(p);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return passportApplication;
	}

	@Override
	public PassportApplication find(int key) {
		String findSQL = "Select * from passport_application where passport_id=?";
		PassportApplication pass=null;
		try(PreparedStatement psFind = conMysql.prepareStatement(findSQL)) {
			psFind.setInt(1, key); 
			
			ResultSet rsFindResult = psFind.executeQuery();
			
			if(rsFindResult.next()) {
				pass = new PassportApplication();
				pass.setPassport_id(rsFindResult.getInt("passport_id"));
				pass.setFirstname(rsFindResult.getString("firstname"));
				pass.setSurname(rsFindResult.getString("surname"));
				pass.setDob(rsFindResult.getString("dob"));
				pass.setNationality(rsFindResult.getString("nationality"));
				pass.setPlace_of_birth(rsFindResult.getString("place_of_birth"));
				pass.setSex(Sex.valueOf(rsFindResult.getString("sex")));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pass;
	}

	@Override
	public PassportApplication remove(int key) {
		PassportApplication passToBeRemoved = find(key);
		if(passToBeRemoved!=null) {
			String sqlDelete = "delete from passport_application where passport_id=?";
			
			try(PreparedStatement psDelete = conMysql.prepareStatement(sqlDelete)) {
				psDelete.setInt(1, key);
				
				int rowsDeleted = psDelete.executeUpdate();
				System.out.println(rowsDeleted+ "Application Deleted");
				
			} catch (Exception e) {
				e.printStackTrace();
			}}
		
		
		return passToBeRemoved;
	}}

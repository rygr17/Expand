package com.expand;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProfile extends Profile  {
	
	public static void addProfile(Profile p){
		
		char SID=p.sid;
		char Password=p.password;
		String fname=p.firstName;
		String lname=p.lastName;
		String University= p.universtiy;
		String Department=p.department;
		
	
	
		
		
		try (Connection conn = DatabaseConnection.getConnection();) {
            PreparedStatement statement = conn.prepareStatement(
                "INSERT INTO PROFILES (SID, PASSWORD, FNAME, LNAME, UNIVERSITY, DEPARTMENT) VALUES(?, ?, ?, ?, ?, ?, ?)"
            );
		
	}
		catch (SQLException e) {
            e.printStackTrace();
		}

}
	
	public static void addhobbies(Hobbies h){
		Boolean fishing=h.fishing;
		Boolean hiking = h.hiking;
		Boolean concerts=h.concerts;
		Boolean traveling=h.traveling;
		Boolean baseball=h.baseball;
		Boolean football=h.football;
		
		try (Connection conn = DatabaseConnection.getConnection();) {
            PreparedStatement statement = conn.prepareStatement(
                "INSERT INTO HOBBIES (FISHING, HIKING, CONCERTS, TRAVELING, BASEBALL,FOOTBALL) VALUES( ?, ?, ?, ? ,? , ?)"
            );
		}
            catch (SQLException e) {
                e.printStackTrace();
            }
		
	}
}

package com.expand;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class AddProfile extends Profile  {
	
	public static void addProfile(Profile p){
		
		String sid = p.sid;
		String password = p.password;
		String fname = p.firstName;
		String lname = p.lastName;
		String university = p.universtiy;
		String department = p.department;
		
	
	
		
		
		try {
			MysqlDataSource datasource = new MysqlDataSource();
			datasource.setUser("expanddb");
			datasource.setPassword("expanddb");
			datasource.setPort(3306);
			datasource.setServerName("10.88.90.27:3306");;
			Connection conn = datasource.getConnection();
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

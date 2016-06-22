package com.expand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DbHelper {

	private static MysqlDataSource datasource;
	
	public static void setProfile(DbProfile profile) {
		datasource = new MysqlDataSource();
		
		datasource.setUser(profile.getUsername());
		datasource.setPassword(profile.getPass());
		datasource.setServerName(profile.getServerName());
	}
	
	public static Connection getConnection() throws Exception {
		if(datasource == null) {
			datasource = new MysqlDataSource();
			
			datasource.setUser("expanddb");
			datasource.setPassword("expanddb");
			datasource.setServerName("10.88.90.27:3306");
		}
		
		return datasource.getConnection();
	}
	
	public static void addProfile(Profile profile) {
		String sid = profile.sid;
		String password = profile.password;
		String fname = profile.firstName;
		String lname = profile.lastName;
		String university = profile.universtiy;
		String department = profile.department;

		try {
			Connection conn = DbHelper.getConnection();
			
			StringBuilder builder = new StringBuilder();
			builder.append("INSERT INTO PROFILE (");
			builder.append("SID").append(",");
			builder.append("PWORD,");
			builder.append("FNAME,");
			builder.append("LNAME");
			builder.append("UNIVERSITY");
			builder.append("DEPT");
			builder.append(") VALUES (");
			builder.append(profile.sid).append(",");
			builder.append(profile.password).append(",");
			builder.append(profile.firstName).append(",");
			builder.append(profile.lastName).append(",");
			builder.append(profile.universtiy).append(",");
			builder.append(profile.department).append(")");
			
			PreparedStatement statement = conn.prepareStatement(builder.toString());
			
			ResultSet result = statement.executeQuery();
			
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static class DbProfile {
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getServerName() {
			return serverName;
		}
		public void setServerName(String serverName) {
			this.serverName = serverName;
		}
		private String url;
		private String username;
		private String pass;
		private String serverName;
	}
}

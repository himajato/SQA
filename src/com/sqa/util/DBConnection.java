package com.sqa.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/dbclpm";
		String userName = "root";
		String password = "nghials123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		return con;
	}	
	
}

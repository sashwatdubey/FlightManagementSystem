package com.cg.fms.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.fms.exceptions.FMSException;

public class JdbcUtility {
	private static Connection connection = null;

	static String url = "jdbc:mysql://localhost:3306/flightmanagement";
	public static Connection getConnection() throws FMSException, ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "root", "root");
			System.out.println("connected");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new FMSException("Error occurred in connecting to database"+e.getMessage());
		}
		return connection;
	}

}

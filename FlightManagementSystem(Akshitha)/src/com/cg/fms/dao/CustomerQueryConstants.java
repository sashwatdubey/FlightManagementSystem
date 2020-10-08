package com.cg.fms.dao;

public interface CustomerQueryConstants {

	String USER_EXISTS = "select * from user where emailid = ?";
	String REGISTER_USER = "insert into user(username,password,mobileno,emailid)values(?,?,?,?);";
	String USER_LOGIN = "select emailid,password from user where emailid=? AND password=? ";
	String VIEW_AVAILABLE_FLIGHTS = "select * from scheduleflight where source_airport=? AND destination_airport=?";
}

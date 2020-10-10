package com.cg.fms.dao;

public interface CustomerQueryConstants {

	String USER_EXISTS = "select * from user where emailid = ?";
	String REGISTER_USER = "insert into user(username,password,mobileno,emailid)values(?,?,?,?);";
	String USER_LOGIN = "select * from user where emailid=? AND password=? ";
	String VIEW_AVAILABLE_FLIGHTS = "select * from scheduleflight where source_airport=? AND destination_airport=?";
	String ADD_PASSENGER = "insert into passenger (passenger_name,passenger_age,aadhar,luggage,userid,passenger_gender,booking_date)values(?,?,?,?,?,?,?)";
	String MAKE_BOOKING = "insert into booking(userid,booking_date,cost,passenger_count,booking_state,flight_number)values(?,?,?,?,?,?)";
	String VIEW_BOOKINGS = "select * from booking  ";
	String GET_BOOKING_DETAILS = "select * from booking where booking_id=? ";
	String DELETE_PASSENGERS = "delete from passenger where userid=? AND booking_date=?";
	String CANCEL_BOOKING = "delete from booking where booking_id=?";
}

package com.cg.fms.model;

import java.sql.Date;

public class Booking {

	private int bookingId;
	private int userId;
	private Date bookingDate;
	private double cost;
	private int passengerCount;
	private String bookingState;
	private int flightNumber;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public String getBookingState() {
		return bookingState;
	}
	public void setBookingState(String bookingState) {
		this.bookingState = bookingState;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate + ", cost="
				+ cost + ", passengerCount=" + passengerCount + ", bookingState=" + bookingState + ", flightNumber="
				+ flightNumber + "]";
	}
	public Booking(int bookingId, int userId, Date bookingDate, double cost, int passengerCount, String bookingState,
			int flightNumber) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.cost = cost;
		this.passengerCount = passengerCount;
		this.bookingState = bookingState;
		this.flightNumber = flightNumber;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int userId, Date bookingDate, double cost, int passengerCount, String bookingState,
			int flightNumber) {
		super();
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.cost = cost;
		this.passengerCount = passengerCount;
		this.bookingState = bookingState;
		this.flightNumber = flightNumber;
	}
	
}

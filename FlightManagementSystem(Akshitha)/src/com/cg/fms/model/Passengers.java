package com.cg.fms.model;

public class Passengers {
	
	private int pnrNumber;
	private String passengerName;
	private int passengerAge;
	private long passengerUIN;
	private double luggage;
	private String passengerGender;
	private int userId;
	private String bookingDate;
	
	
	
	
	
	public Passengers(String passengerName, int passengerAge, long passengerUIN, double luggage, String passengerGender,
			int userId, String bookingDate) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
		this.passengerGender = passengerGender;
		this.userId = userId;
		this.bookingDate = bookingDate;
	}




	public Passengers(int pnrNumber, String passengerName, int passengerAge, long passengerUIN, double luggage,
			String passengerGender, int userId, String bookingDate) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
		this.passengerGender = passengerGender;
		this.userId = userId;
		this.bookingDate = bookingDate;
	}




	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPnrNumber() {
		return pnrNumber;
	}
	
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public long getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLuggage() {
		return luggage;
	}
	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}




	@Override
	public String toString() {
		return "Passengers [pnrNumber=" + pnrNumber + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerUIN=" + passengerUIN + ", luggage=" + luggage + ", passengerGender="
				+ passengerGender + ", userId=" + userId + ", bookingDate=" + bookingDate + "]";
	}
	
	
	
	
	
	
}

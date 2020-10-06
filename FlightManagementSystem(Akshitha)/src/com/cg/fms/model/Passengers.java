package com.cg.fms.model;

public class Passengers {
	
	private int pnrNumber;
	private String passengerName;
	private int passengerAge;
	private long passengerUIN;
	private double luggage;
	
	public int getPnrNumber() {
		return pnrNumber;
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
	public Passengers(int pnrNumber, String passengerName, int passengerAge, long passengerUIN, double luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}
	public Passengers(String passengerName, int passengerAge, long passengerUIN, double luggage) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}
	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

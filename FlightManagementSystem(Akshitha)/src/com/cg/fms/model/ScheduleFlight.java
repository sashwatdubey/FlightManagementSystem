package com.cg.fms.model;

import java.util.Date;

public class ScheduleFlight {

	private int flightNumber;
	private int availableSeats;
	private double cost;
	private String sourceAirport;
	private String destinationAirport;
	private Date departureDate;
	private Date arrivalDate;
	private String arrivalTime;
	private String departureTime;
	
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	private String flightStatus;
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	
	public ScheduleFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduleFlight(int flightNumber, int availableSeats, double cost, String sourceAirport,
			String destinationAirport, Date departureDate, Date arrivalDate, String arrivalTime, String departureTime,
			String flightStatus) {
		super();
		this.flightNumber = flightNumber;
		this.availableSeats = availableSeats;
		this.cost = cost;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.flightStatus = flightStatus;
	}
	
	@Override
	public String toString() {
		return "ScheduleFlight [flightNumber=" + flightNumber + ", availableSeats=" + availableSeats + ", cost=" + cost
				+ ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + ", flightStatus=" + flightStatus + "]";
	}
	
	
	
	
	
}

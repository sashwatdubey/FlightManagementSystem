package com.cg.fms.model;

import java.sql.Date;

public class ScheduleFlight {

	private int flightNumber;
	private int availableSeats;
	private double cost;
	private String sourceAirport;
	private String destinationAirport;
	private Date departureDate;
	private Date arrivalDate;
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
	public ScheduleFlight(int flightNumber, int availableSeats, double cost, String sourceAirport,
			String destinationAirport, Date departureDate, Date arrivalDate, String flightStatus) {
		super();
		this.flightNumber = flightNumber;
		this.availableSeats = availableSeats;
		this.cost = cost;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.flightStatus = flightStatus;
	}
	public ScheduleFlight(int availableSeats, double cost, String sourceAirport, String destinationAirport,
			Date departureDate, Date arrivalDate, String flightStatus) {
		super();
		this.availableSeats = availableSeats;
		this.cost = cost;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.flightStatus = flightStatus;
	}
	public ScheduleFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ScheduleFlight [flightNumber=" + flightNumber + ", availableSeats=" + availableSeats + ", cost=" + cost
				+ ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", flightStatus=" + flightStatus + "]";
	}
	
	
	
	
}

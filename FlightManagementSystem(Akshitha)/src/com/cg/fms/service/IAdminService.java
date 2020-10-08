package com.cg.fms.service;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Airport;
import com.cg.fms.model.Flight;
import com.cg.fms.model.ScheduleFlight;

import java.util.*;

public interface IAdminService {
	
	public int addFlights(Flight flight) throws FMSException;
	
	public List<Flight> viewFlights() throws FMSException;
	
	public List<Airport> viewAirports() throws FMSException;
	
	public int scheduleFlight(ScheduleFlight scheduleFlight) throws FMSException;
	
	public List<ScheduleFlight> viewScheduleFlights() throws FMSException;
	
}

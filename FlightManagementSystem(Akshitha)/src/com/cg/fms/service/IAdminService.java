package com.cg.fms.service;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;
import java.util.*;

public interface IAdminService {
	
	public int addFlights(String flightModel, String carrierName, int seatCapacity) throws FMSException;
	
	public List<Flight> viewFlights() throws FMSException;
	
}

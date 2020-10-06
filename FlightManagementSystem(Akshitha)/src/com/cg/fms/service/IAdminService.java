package com.cg.fms.service;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;
import java.util.*;

public interface IAdminService {
	
	public int addFlights(Flight flight) throws FMSException;
	
	public List<Flight> viewFlights() throws FMSException;
	
}

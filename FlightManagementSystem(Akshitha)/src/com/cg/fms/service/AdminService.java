package com.cg.fms.service;


import java.util.List;
import com.cg.fms.dao.AdminDAO;
import com.cg.fms.dao.IAdminDAO;
import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;

public class AdminService implements IAdminService{

	IAdminDAO adminDao = new AdminDAO();

	public int addFlights(String flightModel, String carrierName, int seatCapacity) throws FMSException {
		// TODO Auto-generated method stub
		return adminDao.addFlights(flightModel, carrierName, seatCapacity);
	}

	public List<Flight> viewFlights() throws FMSException {
		// TODO Auto-generated method stub
		return adminDao.viewFlights();
	}
	
	

}

package com.cg.fms.service;


import java.util.List;
import com.cg.fms.dao.AdminDAO;
import com.cg.fms.dao.IAdminDAO;
import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;

public class AdminService implements IAdminService{

	IAdminDAO adminDao = new AdminDAO();

	public int addFlights(Flight flight) throws FMSException {
		// TODO Auto-generated method stub
		return adminDao.addFlights(flight);
	}

	public List<Flight> viewFlights() throws FMSException {
		// TODO Auto-generated method stub
		return adminDao.viewFlights();
	}
	
	

}

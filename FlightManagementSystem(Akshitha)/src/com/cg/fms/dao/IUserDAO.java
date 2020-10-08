package com.cg.fms.dao;

import java.util.List;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.ScheduleFlight;
import com.cg.fms.model.User;

public interface IUserDAO {

	public boolean isUserExists(String emailId) throws FMSException;
	
	public int accountCreation(User user) throws FMSException;

	public int userLogin(String emailId, String password) throws FMSException;
	
	public List<ScheduleFlight> viewAvailableFlights(String source,String destination) throws FMSException;

}


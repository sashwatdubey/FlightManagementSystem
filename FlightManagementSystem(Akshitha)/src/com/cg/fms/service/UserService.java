package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dao.IUserDAO;
import com.cg.fms.dao.UserDAO;
import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.ScheduleFlight;
import com.cg.fms.model.User;

public class UserService implements IUserService {

	IUserDAO userDao = new UserDAO();

	public boolean isUserExists(String emailId) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.isUserExists(emailId);
	}

	public int accountCreation(User user) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.accountCreation(user);
	}

	public int userLogin(String emailId, String password) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.userLogin(emailId, password);
	}
	
	public List<ScheduleFlight> viewAvailableFlights(String source,String destination) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.viewAvailableFlights(source,destination);
	}


}

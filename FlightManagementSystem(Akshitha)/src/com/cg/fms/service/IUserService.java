package com.cg.fms.service;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.User;

public interface IUserService {

	public boolean isUserExists(String emailId) throws FMSException;

	public int accountCreation(User user) throws FMSException;
	
	public int userLogin(String emailId,String password) throws FMSException;
	
}

package com.cg.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.ScheduleFlight;
import com.cg.fms.model.User;
import com.cg.fms.utility.JdbcUtility;

public class UserDAO implements IUserDAO{

	static Connection connection = null;
	static PreparedStatement prepareStatement = null;
	static ResultSet resultSet = null;
	
	public boolean isUserExists(String emailId) throws FMSException {
		boolean found = false;
		try {
			connection = JdbcUtility.getConnection();
			prepareStatement = connection.prepareStatement(CustomerQueryConstants.USER_EXISTS);
			prepareStatement.setString(1, emailId);
			resultSet = prepareStatement.executeQuery();
			if(resultSet.next()) {
				found = true;
			}
		} catch (SQLException e) {
			throw new FMSException("problem while creating PS object");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new FMSException("problem while creating PS object");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new FMSException("problem while closing");
			}

		}
        return found;
	}
	public int accountCreation(User user) throws FMSException {
		// TODO Auto-generated method stub
				int isInserted = 0;
				try {
				  connection = JdbcUtility.getConnection();
				  prepareStatement = connection.prepareStatement(CustomerQueryConstants.REGISTER_USER, Statement.RETURN_GENERATED_KEYS );
				  prepareStatement.setString(1,user.getUserName());
				  prepareStatement.setString(2,user.getPassword() );
				  prepareStatement.setLong(3,user.getMobileNumber() );
				  prepareStatement.setString(4,user.getEmailId() );
				  prepareStatement.executeUpdate();
				  resultSet = prepareStatement.getGeneratedKeys();
				while(resultSet.next()) {
					isInserted = resultSet.getInt(1);
				}
				  System.out.println("inserted successfully");
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						connection.close();
					} catch (SQLException e) {
						throw new FMSException("problem while closing");
					}

				}
				return isInserted;
	}
	public int userLogin(String emailId, String password) throws FMSException {
		// TODO Auto-generated method stub
		int rows =0;
		try {
				connection = JdbcUtility.getConnection();
				prepareStatement = connection.prepareStatement(CustomerQueryConstants.USER_LOGIN);
				prepareStatement.setString(1, emailId);
				prepareStatement.setString(2, password);
				resultSet = prepareStatement.executeQuery();
				if(resultSet.next()) {
					rows = resultSet.getInt(1);
					
				}
			}
			catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					throw new FMSException("problem while closing");
				}

			}
			return rows;
	}
		
	
	public List<ScheduleFlight> viewAvailableFlights(String source,String destination) throws FMSException {
		List<ScheduleFlight> scheduleFlights = new ArrayList<ScheduleFlight>();
		ScheduleFlight scheduleFlight = null;
		
		try {
			connection = JdbcUtility.getConnection();
			prepareStatement = connection.prepareStatement(CustomerQueryConstants.VIEW_AVAILABLE_FLIGHTS);
			prepareStatement.setString(1, source);
			prepareStatement.setString(2, destination);
			resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()) {
				scheduleFlight= new ScheduleFlight();
				scheduleFlight.setFlightNumber(resultSet.getInt(1));
				scheduleFlight.setAvailableSeats(resultSet.getInt(2));
				scheduleFlight.setCost(resultSet.getDouble(3));
				scheduleFlight.setSourceAirport(resultSet.getString(4));
				scheduleFlight.setDestinationAirport(resultSet.getString(5));
				scheduleFlight.setDepartureDate(resultSet.getDate(6));
				scheduleFlight.setArrivalDate(resultSet.getDate(7));
				scheduleFlight.setArrivalTime(resultSet.getString(8));
				scheduleFlight.setDepartureTime(resultSet.getString(9));
				scheduleFlight.setFlightStatus(resultSet.getString(10));
				scheduleFlights.add(scheduleFlight);
			}
		
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new FMSException("problem while closing");
			}

		}
		return scheduleFlights;
	}
	

	
}

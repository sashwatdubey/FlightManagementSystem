package com.cg.fms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Airport;
import com.cg.fms.model.Flight;
import com.cg.fms.model.ScheduleFlight;
import com.cg.fms.utility.JdbcUtility;

public class AdminDAO implements IAdminDAO {
	static Connection connection = null;
	static PreparedStatement preparedStatement = null;
	static ResultSet resultSet = null;
	
	public  int addFlights(Flight flight) throws FMSException {
		int rows =0;
		
		try {
			connection = JdbcUtility.getConnection();
			preparedStatement = connection.prepareStatement(AdminQueryConstants.ADD_FLIGHT,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, flight.getFlightModel());
			preparedStatement.setString(2, flight.getCarrierName());
			preparedStatement.setInt(3, flight.getSeatCapacity());
			preparedStatement.executeUpdate();
			resultSet =preparedStatement.getGeneratedKeys();
			while(resultSet.next()){
				rows = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new FMSException("problem while closing");
			}
	
		}
		return rows;
	}
	
	public List<Flight> viewFlights() throws FMSException {
		List<Flight> list = new ArrayList<Flight>();
		Flight flight = null;
		
		try {
			connection = JdbcUtility.getConnection();
			preparedStatement = connection.prepareStatement(AdminQueryConstants.VIEW_FLIGHTS);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
	        	flight = new Flight();
	        	flight.setFlightNumber(resultSet.getInt(1));
	        	flight.setFlightModel(resultSet.getString(2));
	        	flight.setCarrierName(resultSet.getString(3));
	        	flight.setSeatCapacity(resultSet.getInt(4));
	        	list.add(flight);
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
		return list;
	}

	@Override
	public List<Airport> viewAirports() throws FMSException {
		// TODO Auto-generated method stub
		List<Airport> airports = new ArrayList<Airport>();
		Airport airport = null;
		try {
			connection = JdbcUtility.getConnection();
			preparedStatement = connection.prepareStatement(AdminQueryConstants.VIEW_AIRPORTS);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				airport = new Airport();
				airport.setAirportCode(resultSet.getString(1));
				airport.setAirportName(resultSet.getString(2));
				airport.setAirportLocation(resultSet.getString(3));
				airports.add(airport);
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
		
		return airports;
		
	}

	@Override
	public int scheduleFlight(ScheduleFlight scheduleFlight) throws FMSException {
		// TODO Auto-generated method stub
		int rows =0;
		try {
			connection = JdbcUtility.getConnection();
			preparedStatement = connection.prepareStatement(AdminQueryConstants.SCHEDULE_FLIGHT);
			preparedStatement.setInt(1, scheduleFlight.getFlightNumber());
			preparedStatement.setInt(2, scheduleFlight.getAvailableSeats());
			preparedStatement.setDouble(3, scheduleFlight.getCost());
			preparedStatement.setString(4, scheduleFlight.getSourceAirport());
			preparedStatement.setString(5, scheduleFlight.getDestinationAirport());
			preparedStatement.setString(6, scheduleFlight.getFlightStatus());
			preparedStatement.setDate(7, new Date(scheduleFlight.getDepartureDate().getTime()));
			preparedStatement.setDate(8, new Date(scheduleFlight.getArrivalDate().getTime()));
			preparedStatement.setString(9, scheduleFlight.getArrivalTime());
			preparedStatement.setString(10, scheduleFlight.getDepartureTime());
			rows = preparedStatement.executeUpdate();
			//resultSet =preparedStatement.getGeneratedKeys();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new FMSException("problem while closing");
			}
	
		}
		return rows;
	}
}

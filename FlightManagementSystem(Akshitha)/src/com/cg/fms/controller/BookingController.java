package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.model.Booking;
import com.cg.fms.model.Passengers;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;
@WebServlet("/BookingController")
public class BookingController  extends HttpServlet{
	
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService service = new UserService();
		int isCreated = 0;
	    PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = null;
		List<Passengers> passengers = new ArrayList<Passengers>();
		Booking booking = null;
		Booking booking1 = null;
		
		
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis()); 
		String bookingDate=timestamp.toString();  
		
		ServletContext context = request.getServletContext();
		
		int userId = Integer.parseInt(""+context.getAttribute("userId"));
		
		String firstPassengerName = request.getParameter("name1");
		String secondPassengerName = request.getParameter("name2");
		String thirdPassengerName = request.getParameter("name3");
		String fourthPassengerName = request.getParameter("name4");
		
	
		int firstPassengerAge = Integer.parseInt(request.getParameter("age1"));
		int secondPassengerAge = Integer.parseInt(request.getParameter("age2"));
		int thirdPassengerAge = Integer.parseInt(request.getParameter("age3"));
		int fourthPassengerAge = Integer.parseInt(request.getParameter("age4"));
		
		String firstPassengerGender = request.getParameter("gender1");
		String secondPassengerGender = request.getParameter("gender2");
		String thirdPassengerGender = request.getParameter("gender3");
		String fourthPassengerGender = request.getParameter("gender4");
		
		double firstPassengerLuggage = Double.parseDouble(request.getParameter("luggage1"));
		double secondPassengerLuggage = Double.parseDouble(request.getParameter("luggage1"));
		double thirdPassengerLuggage = Double.parseDouble(request.getParameter("luggage1"));
		double fourthPassengerLuggage = Double.parseDouble(request.getParameter("luggage1"));
		
		long firstPassengerAadhar = Long.parseLong(request.getParameter("aadhar1"));
		long secondPassengerAadhar = Long.parseLong(request.getParameter("aadhar2"));
		long thirdPassengerAadhar = Long.parseLong(request.getParameter("aadhar3"));
		long fourthPassengerAadhar = Long.parseLong(request.getParameter("aadhar4"));
		
		Passengers firstPassenger = new Passengers(firstPassengerName,firstPassengerAge,firstPassengerAadhar,firstPassengerLuggage,firstPassengerGender,userId,bookingDate);
		Passengers secondPassenger = new Passengers(secondPassengerName,secondPassengerAge,secondPassengerAadhar,secondPassengerLuggage,secondPassengerGender,userId,bookingDate);
		Passengers thirdPassenger = new Passengers(thirdPassengerName,thirdPassengerAge,thirdPassengerAadhar,thirdPassengerLuggage,thirdPassengerGender,userId,bookingDate);
		Passengers fourthPassenger = new Passengers(fourthPassengerName,fourthPassengerAge,fourthPassengerAadhar,fourthPassengerLuggage,fourthPassengerGender,userId,bookingDate);
		
		passengers.add(firstPassenger);
		passengers.add(secondPassenger);
		passengers.add(thirdPassenger);
		passengers.add(fourthPassenger);
		
		int passengerCount = passengers.size();
		
		booking = new Booking(userId, bookingDate, 4000, passengerCount, "booked", 1);
		booking1 = new Booking(userId, bookingDate, 5000, passengerCount, "booked", 4);
		try {
			int addPassenger = 0;
			int makeBooking = 0;
			for (Passengers passenger : passengers) {
				if(passenger != null)
				addPassenger = service.addPasseneger(passenger);
					}
			if(addPassenger != 0) {
				makeBooking = service.makeBooking(booking);
				makeBooking = service.makeBooking(booking1);
			}
			if(makeBooking>0) {
				dispatcher = request.getRequestDispatcher("CancelBookingController");
				dispatcher.forward(request, response);
			}
			System.out.println(addPassenger);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}

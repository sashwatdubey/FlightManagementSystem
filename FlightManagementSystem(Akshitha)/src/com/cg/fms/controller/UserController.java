package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UserController")
public class UserController   extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher dis = null;
		
		if(request.getParameter("checkAvailableFlights") != null) {
			dis = request.getRequestDispatcher("UserViewAirportsController");
			dis.include(request, response);
		} else if(request.getParameter("viewBookings") != null) {
			dis = request.getRequestDispatcher("ViewBookingController");
			dis.include(request, response);
		} 
}
}




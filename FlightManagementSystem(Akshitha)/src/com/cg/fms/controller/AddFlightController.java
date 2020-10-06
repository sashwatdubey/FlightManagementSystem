package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.dao.AdminDAO;
import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;
import com.cg.fms.model.User;
import com.cg.fms.service.AdminService;
import com.cg.fms.service.IAdminService;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;
@WebServlet("/AddFlightController")
public class AddFlightController extends HttpServlet {
	int isCreated =0;
	IAdminService service = new AdminService();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    String flightModel = request.getParameter("flightmodel");
	String carrierName = request.getParameter("carriername");
	int seatCapacity = Integer.parseInt(request.getParameter("seatcapacity"));
	Flight flight = new Flight(flightModel, carrierName, seatCapacity);
	PrintWriter out = response.getWriter();
	RequestDispatcher dispatcher =null;
	
	if(flightModel == null & carrierName == null & seatCapacity == 0 ) {
		out.println("please enter correct values");
		dispatcher = request.getRequestDispatcher("addFlight.jsp");
		dispatcher.include(request, response);
	
	} else {

	 try {
		isCreated = service.addFlights(flightModel,carrierName,seatCapacity);
		if(isCreated > 0) {
		out.println("successfully added");
		dispatcher = request.getRequestDispatcher("addFlight.jsp");
		dispatcher.include(request, response);
		} else {
			out.println("problem while inserting values");
			dispatcher = request.getRequestDispatcher("addFlight.jsp");
			dispatcher.include(request, response);
		}
	 } catch (FMSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	 }
	}
}

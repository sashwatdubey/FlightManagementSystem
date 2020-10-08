package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Airport;
import com.cg.fms.model.ScheduleFlight;
import com.cg.fms.service.AdminService;
import com.cg.fms.service.IAdminService;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;
@WebServlet("/ViewAvailableFlightsController")
public class ViewAvailableFlightsController  extends HttpServlet{
	IUserService userService = new UserService();
	RequestDispatcher dispatcher=null;
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		
		
	
		try {
			
			String source = request.getParameter("source");
			String destination = request.getParameter("destination");
			List<ScheduleFlight> scheduleFlights =  userService.viewAvailableFlights(source,destination);
			System.out.println(scheduleFlights);
			if(scheduleFlights.size() > 0) {
				request.setAttribute("scheduleFlights",scheduleFlights);
				dispatcher = request.getRequestDispatcher("viewAvailableFlights.jsp");
				dispatcher.forward(request,response);
			} else {
				out.println("sorry flights are not added yet");
				dispatcher = request.getRequestDispatcher("userPage.jsp");
				dispatcher.include(request,response);
				
			}
		} catch (FMSException e) {
			e.printStackTrace();
		}
		
		
	}
}
 
	
		



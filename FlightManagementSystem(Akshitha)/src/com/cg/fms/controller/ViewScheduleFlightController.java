package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;
import com.cg.fms.model.ScheduleFlight;
import com.cg.fms.service.AdminService;
import com.cg.fms.service.IAdminService;

@WebServlet("/ViewScheduleFlightController")
public class ViewScheduleFlightController extends HttpServlet{
	IAdminService service = new AdminService();
	RequestDispatcher dispatcher=null;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
	
		try {
			List<ScheduleFlight> scheduleFlights =  service.viewScheduleFlights();
			System.out.println(scheduleFlights);
			if(scheduleFlights.size() > 0) {
				request.setAttribute("scheduleFlights",scheduleFlights);
				dispatcher = request.getRequestDispatcher("ViewScheduleFlight.jsp");
				dispatcher.forward(request,response);
			} else {
				out.println("sorry flights are not added yet");
				dispatcher = request.getRequestDispatcher("adminPage.jsp");
				dispatcher.forward(request,response);
				
			}
		} catch (FMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

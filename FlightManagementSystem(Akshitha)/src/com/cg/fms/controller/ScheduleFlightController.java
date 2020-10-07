package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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

@WebServlet("/ScheduleFlightController")
public class ScheduleFlightController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher =null;
		ServletContext context = request.getServletContext();
		IAdminService service = new AdminService();
		int flightNumber = Integer.parseInt(""+context.getAttribute("flightNumber"));
		double ticketCost = Double.parseDouble(request.getParameter("cost"));
		int availableSeats = Integer.parseInt(request.getParameter("availableSeats"));
		String sourceAirport = request.getParameter("source");
		String destinationAirport = request.getParameter("destination");
		String arrivalTime = request.getParameter("arrivalTime");
		String departureTime = request.getParameter("departureTime");
		String flightStatus = request.getParameter("flightstatus");
		int isCreated = 0;
		if(sourceAirport.equals(destinationAirport)) {
			out.println("source and departure cannot be same");
			dispatcher = request.getRequestDispatcher("scheduleFlight.jsp");
			dispatcher.include(request, response);
		
		} else {

		 try {
			Date departureDate = new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("departureDate"));
			Date arrivalDate= new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("arrivalDate"));
			ScheduleFlight scheduleFlight = new ScheduleFlight(flightNumber, availableSeats, ticketCost, sourceAirport, destinationAirport, departureDate, arrivalDate, arrivalTime, departureTime, flightStatus);		
			isCreated = service.scheduleFlight(scheduleFlight);
			if(isCreated > 0) {
			out.println("successfully scheduled");
			dispatcher = request.getRequestDispatcher("scheduleFlight.jsp");
			dispatcher.include(request, response);
			} else {
				out.println("problem while inserting values");
				dispatcher = request.getRequestDispatcher("scheduleFlight.jsp");
				dispatcher.include(request, response);
			}
		 } catch (FMSException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

		 }
		
		
		
	}
}

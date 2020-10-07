package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Airport;
import com.cg.fms.service.AdminService;
import com.cg.fms.service.IAdminService;

@WebServlet("/ViewAirportsController")
public class ViewAirportsController extends HttpServlet { 

	IAdminService service = new AdminService();
	RequestDispatcher dispatcher=null;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		List<Airport> airports = new ArrayList<Airport>();
		int flightNumber = Integer.parseInt(request.getParameter("flightNumber"));
		ServletContext context = request.getServletContext();
		context.setAttribute("flightNumber", flightNumber);
		try {
			airports = service.viewAirports();
			if(airports.size()>0) {
				dispatcher = request.getRequestDispatcher("scheduleFlight.jsp");
				request.setAttribute("airports", airports);
				dispatcher.forward(request, response);
			}
		} catch (FMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}

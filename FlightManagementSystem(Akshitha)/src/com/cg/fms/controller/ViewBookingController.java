package com.cg.fms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Booking;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;
@WebServlet("/ViewBookingController")
public class ViewBookingController  extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			IUserService userService = new UserService();
			
			try {
				List<Booking> bookings = userService.viewBookings();
				System.out.println(bookings);
			} catch (FMSException e) {
				
				e.printStackTrace();
			}
			
			
		}
	
}

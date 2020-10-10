package com.cg.fms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Booking;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;
@WebServlet("/CancelBookingController")
public class CancelBookingController  extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				IUserService service = new UserService();
				int userId = 0;
				String bookingDate = null;
				boolean isDeleted = false;
				boolean isCancelled = false;
				try {
					Booking booking = service.getPassengersDetails(1);
					userId = booking.getUserId();
					bookingDate = booking.getBookingDate();
					isDeleted = service.deletePassengers(bookingDate, userId);
					isCancelled = service.cancelBooking(1);
				} catch (FMSException e) {
					
					e.printStackTrace();
				}
	}

}

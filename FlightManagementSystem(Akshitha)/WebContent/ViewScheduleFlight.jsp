<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cg.fms.dao.AdminDAO, java.sql.*" %>
    <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table >
<tr><th>FlightNumber</th><th>Available Seats</th><th>Ticket Cost</th><th>SourceAirport</th><th>DestinationAirport</th><th>DepartureDate</th><th>ArrivalDate</th><th>ArrivalTime</th><th>DestinationTime</th><th>FlightStatus</th></tr>
<c:forEach items="${scheduleFlights}" var="scheduleFlight">
<tr><td><c:out value ="${scheduleFlight.flightNumber}"/></td>
<td><c:out value ="${scheduleFlight.availableSeats}"/></td>
<td><c:out value ="${scheduleFlight.cost}"/></td>
<td><c:out value ="${scheduleFlight.sourceAirport}"/></td>
<td><c:out value ="${scheduleFlight.destinationAirport}"/></td>
<td><c:out value ="${scheduleFlight.departureDate}"/></td>
<td><c:out value ="${scheduleFlight.arrivalDate}"/></td>
<td><c:out value ="${scheduleFlight.arrivalTime}"/></td>
<td><c:out value ="${scheduleFlight.departureTime}"/></td>
<td><c:out value ="${scheduleFlight.flightStatus}"/></td>

</td></tr>
</c:forEach>

</table>
</body>
</html>
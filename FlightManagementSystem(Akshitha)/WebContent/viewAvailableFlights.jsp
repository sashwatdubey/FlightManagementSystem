<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.cg.fms.dao.UserDAO, java.sql.*" %>
    <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ViewAvailableFlightsController" method="post">
		Source Airport:<select name="source">
        <c:forEach items="${airports}" var="airport">
            <option value="${airport.airportName}">${airport.airportName}</option>
        </c:forEach>
    </select><br>
Destination Airport:<select name="destination">
               <c:forEach items="${airports}" var="airport">
            <option value="${airport.airportName}">${airport.airportName}</option>
        </c:forEach>
    </select><br>
    
    <button type="submit">Search</button>
	
	
	</form>


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

<td><a href="BookingController?flightNumber=${scheduleFlight.flightNumber}">Book</a>
</td></tr>
</c:forEach>

</table>
</body>
</html>
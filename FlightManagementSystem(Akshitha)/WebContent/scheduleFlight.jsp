<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*, java.util.*,com.cg.fms.dao.AdminDAO" %>
    <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ScheduleFlightController" method = "post">
Ticket Cost:<input type = "text" name = "cost"><br>
Available Seats:<input type = "text" name = "availableSeats"><br>
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
Departure Date<input type ="text" name ="departureDate"><br>
Arrival Date<input type = "text" name="arrivalDate"><br>
Arrival Time<input type = "text" name = "arrivalTime"><br>
Departure Time<input type = "text" name = "departureTime"><br>
Schedule Flight status<input type = "text" name ="flightstatus"><br>
<input type ="submit" value = "submit"> 
</form>
<%



%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action = "BookingController" method ="post">
	<table>
	<tr><th>Passengers</th><th>Name</th><th>Age</th><th>Gender</th><th>Luggage</th></tr>
	
	<tr><td>Passenger1 <input type = "text" name = "name1">
	<input type="text" name = "age1"></td></tr>
	<tr><td>Passenger2 <input type = "text" name = "name2">
	<input type="text" name = "age2"></td></tr>
		<tr><td>Passenger3 <input type = "text" name = "name3">
	<input type="text" name = "age3"></td></tr>
	<tr><td>Passenger4 <input type = "text" name = "name4">
	<input type="text" name = "age4"></td></tr>

	<input type = "submit" value = "Submit">
</table>
</form>
</body>
</html>
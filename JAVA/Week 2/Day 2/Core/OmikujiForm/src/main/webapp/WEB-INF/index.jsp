<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Send An Omikuji!</h3>
    
    <form action='/processForm' method='post'>
	<label>Number:</label>
    	<input type="number" name='num'> <br/>
	<label>City:</label>
    	<input type="text" name='city'><br/>
	<label>Person:</label>
    	<input type="text" name='person'><br/>
	<label>Hobby:</label>
    	<input type="text" name='hobby'><br/>
	<label>Animal:</label>
    	<input type="text" name='animal'><br/>
	<label>Something Nice:</label>
    	<input type='text' name='nice'><br/>
    	
    <button>Submit</button>
    </form>
</body>
</html>
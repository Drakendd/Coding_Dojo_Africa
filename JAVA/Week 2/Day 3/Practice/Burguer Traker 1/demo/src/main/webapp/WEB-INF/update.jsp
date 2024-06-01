<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>yassin's burger</title>
</head>
<body>
<h3>Edit Burger</h3>
	<a href="/burgers">GO BACK</a>
	<form:form action="/burgers/${burger.id}" method="put" modelAttribute="burger" >
            <p>
                <form:label path="name">Burger Name</form:label>
                <form:errors path="name" class="text-danger"/>
                <form:input class="form-control" path="name"/>
            </p>
            <p>
                <form:label path="restaurantName">Restaurant Name</form:label>
                <form:input class="form-control" path="restaurantName"/>
                <form:errors path="restaurantName" class="text-danger"/>
            </p>
            <p>
                <form:label path="rating">Rating</form:label>
                <form:errors path="rating" class="text-danger"/>
                <form:input type="number" class="form-control" path="rating"/>
            </p>
            <p>
                <form:label path="notes">Notes:</form:label>
                <form:errors path="notes" class="text-danger"/>
                <form:textarea class="form-control" path="notes"/>
            </p>
            <br/>
            <input type="submit" value="Submit" class="btn btn-success"/>
        </form:form>
   


</body>
</html>
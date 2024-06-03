<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SaveTravels</title>
</head>
<body>
<h1>Save Travels</h1>
   <table class="table">
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
	     <c:forEach items="${expenses}" var="oneExpense">
        <tr>
            <td><a href="/expenses/${oneExpense.id}">${oneExpense.name}</a></td>
            <td>${oneExpense.vendor}</td>
            <td>$${oneExpense.amount}</td>
            <td class="d-flex">
            <a href="/expenses/edit/${oneExpense.id}" class="btn btn-warning">Edit</a>
            <form action="/expenses/${oneExpense.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input type="submit" value="Delete" class="btn btn-danger">
			</form>
            
            </td>
        </tr>
         </c:forEach>
    </tbody>
</table>

	<h3>Add an expense:</h3>
	
	<form:form action="/newExpense" method="post" modelAttribute="expense" >
            <p>
                <form:label path="name">Expense Name:</form:label>
                <form:errors path="name" class="text-danger"/>
                <form:input class="form-control" path="name"/>
            </p>
            <p>
                <form:label path="vendor">Vendor:</form:label>
                <form:input class="form-control" path="vendor"/>
                <form:errors path="vendor" class="text-danger"/>
            </p>
            <p>
                <form:label path="amount">Amount:</form:label>
                <form:errors path="amount" class="text-danger"/>
                <form:input type="number" step=".01" class="form-control" path="amount"/>
            </p>
            <p>
                <form:label path="description">Description:</form:label>
                <form:errors path="description" class="text-danger"/>
                <form:textarea class="form-control" path="description"/>
            </p>
            <br/>
            <input type="submit" value="Submit" class="btn btn-success"/>
        </form:form>

</body>
</html>
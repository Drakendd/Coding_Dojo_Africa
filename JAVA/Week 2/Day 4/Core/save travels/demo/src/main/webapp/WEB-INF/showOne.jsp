<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
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
<meta charset="${encoding}">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
<h1>Expense Details</h1>
   <a href="/expenses">Go back</a>
   
   <p>Expense Name: ${expense.name}</p><br/>
   <p>Expense Description: ${expense.description}</p><br/>
   <p>Vendor: ${expense.vendor}</p><br/>
   <p>Amount: ${expense.amount}</p><br/>
${cursor}
</div>
</body>
</html>
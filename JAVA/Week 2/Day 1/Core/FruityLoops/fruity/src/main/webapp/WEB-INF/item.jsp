<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container">
	<table class="table" style="color: red;">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneFruit" items="${fruits}">
				<tr>
					<td><c:out value="${oneFruit.getName()}"></c:out></td>
					<td><c:out value="${oneFruit.getPrice()}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
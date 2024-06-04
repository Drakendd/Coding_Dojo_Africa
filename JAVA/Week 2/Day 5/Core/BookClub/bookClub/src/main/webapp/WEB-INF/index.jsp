<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>books</title>
</head>
<body>
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h1>All books</h1>
			<div>
			<a href="/books/new" class="btn btn-info"> create book</a>
			<a href="/logout" class="btn btn-danger">Logout</a>
			</div>
		</div>
		<table class="table">
    <thead>
        <tr>
            <th>title</th>
            <th>authorName</th>
            <th>postedBy</th>
            <th>actions</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach items="${allbooks}" var="book">
        <tr>
			 <td><a href="/books/show/${book.id }">${book.title }</a></td>
            <td>${book.authorname }</td>
            <td>${book.postedBy.userName}</td>
            
            <td><c:if test="${user.id== book.postedBy.id}">
            <div class ="d-flex">
               <div>
                <a class="btn btn-primary" href="/books/edit/${book.id}">Edit</a>   
                             
               </div>
               <form action="/books/${book.id}" method="post">
               <input type="hidden"name="_method" value="delete">
               <input type="submit" value="delete" class="btn btn-danger">
               </form>
            
            </div></c:if>
            </td>
        </tr>
         </c:forEach>
    </tbody>
</table>
		


	</div>
</body>
</html>
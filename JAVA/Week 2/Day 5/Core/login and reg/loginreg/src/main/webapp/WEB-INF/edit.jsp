<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<div class="container mt-3">

<h1> update${book.model} car </h1>
<form:form action="/cars/${book.id}" method="post" modelAttribute="car">
<input type="hidden" name="_method" value="put">
    <form:label class="form-label" path="model"> Title </form:label>
    <form:input class="form-control" path="model"/>
    <form:errors class ="text-danger" path="model"></form:errors> 

<br>
    <form:label class="form-label" path="color"> author </form:label>
    <form:input class="form-control" path="color"/>
    <form:errors class ="text-danger" path="color"></form:errors> 
 <br>

     <form:label class="form-label" path="releaseDate"> My thoughts </form:label>
    <form:input  type="date" class="form-control" path="releaseDate"/>
    <form:errors class ="text-danger" path="releaseDate"></form:errors> 
   <br>
   <div>
   <a class="btn btn-danger" href="/books">Cancel</a>
   <input type="submit" value="Update" class="btn btn-success">
   </div>
</form:form>
   
   
</div>
</html>
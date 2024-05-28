<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SHOW</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class="table-responsive">
  <table class="table table-bordered">
    <tbody>
      <tr>
        <th scope="row">Title</th>
        <td>${book.title}</td>
      </tr>
      <tr>
        <th scope="row">Description</th>
        <td>${book.description}</td>
      </tr>
      <tr>
        <th scope="row">Language</th>
        <td>${book.language}</td>
      </tr>
      <tr>
        <th scope="row">Pages</th>
        <td>${book.numberOfPages}</td>
      </tr>
    </tbody>
  </table>
</div>


</body>
</html>
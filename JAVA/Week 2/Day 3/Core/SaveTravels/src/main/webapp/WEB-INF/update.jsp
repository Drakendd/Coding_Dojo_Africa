<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!-- c:out ; c:forEach etc. -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!-- Formatting (dates) -->
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
            <!-- form:form -->
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
                <!-- for rendering errors on PUT routes -->
                <%@ page isErrorPage="true" %>
                    <!DOCTYPE html>
                    <html>

                    <head>
                        <meta charset="UTF-8">
                        <title>Spring Boot</title>
                        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
                        <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
                        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
                        <script type="text/javascript" src="/js/app.js"></script>
                        <!-- change to match your file/naming structure -->
                    </head>

                    <body>
                        <h3>Edit Expense</h3>
                        <a href="/burgers">GO BACK</a>
                        <form:form action="/expenses/${expense.id}" method="put" modelAttribute="expense">
                            <p>
                                <form:label path="name">Expense Name</form:label>
                                <form:errors path="name" class="text-danger" />
                                <form:input class="form-control" path="name" />
                            </p>
                            <p>
                                <form:label path="vendor">Vendor</form:label>
                                <form:input class="form-control" path="vendor" />
                                <form:errors path="vendor" class="text-danger" />
                            </p>
                            <p>
                                <form:label path="amount">Amount</form:label>
                                <form:errors path="amount" class="text-danger" />
                                <form:input type="number" class="form-control" path="amount" />
                            </p>
                            <p>
                                <form:label path="description">Description:</form:label>
                                <form:errors path="description" class="text-danger" />
                                <form:textarea class="form-control" path="description" />
                            </p>
                            <br />
                            <input type="submit" value="Submit" class="btn btn-success" />
                        </form:form>
                    </body>

                    </html>
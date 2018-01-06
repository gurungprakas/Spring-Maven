<%-- 
    Document   : index
    Created on : Jul 18, 2017, 9:42:04 PM
    Author     : Prakas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Customers</h1>
        <div>
            <p>
                <a href="${pageContext.request.contextPath}/add">Add Customer</a>
            </p>
        </div>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact No</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            <c:forEach var="c" items="${customers}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.firstName} ${c.lastName}</td>
                    <td>${c.email}</td>
                    <td>${c.contactNo}</td>
                    <td>${c.status}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/edit/${c.id}" class="btn btn-success">Update</a>
                        <a href="${pageContext.request.contextPath}/delete/${c.id}" class="btn btn-danger"">Delete</a>   
                    </td>
                </tr>
            </c:forEach>
                
        </table>
    </body>
</html>

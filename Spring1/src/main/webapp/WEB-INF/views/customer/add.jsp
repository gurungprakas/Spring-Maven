 <%-- 
    Document   : add
    Created on : Jul 19, 2017, 10:40:13 AM
    Author     : Prakas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Customer</h1>
        <form method="post" action="">
            <div>
                <label>First Name</label>
                <input type="text" name="firstName" required="required">
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name="lastName" required="required">
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email" required="required">
            </div>
            <div>
                <label>Contact No</label>
                <input type="text" name="contactNo" required="required">
            </div>
            <div>
                <label>Status</label>
                <input type="checkbox" name="status" >
            </div>
            <button type="submit">Save</button>
                
            
        </form>
    </body>
</html>

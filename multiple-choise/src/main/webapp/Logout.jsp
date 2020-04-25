<%-- 
    Document   : Logout
    Created on : Mar 12, 2020, 3:55:17 PM
    Author     : Mr Loi Ho
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <h1>Welcome to logout page</h1>
        <% 
           if (session.getAttribute("name") == null){
                response.sendRedirect("Login.jsp");
            }
        %>
        <form action="Logout">
            <button type="submit">Logout</button>
        </form>
    </body>
</html>

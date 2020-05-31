<%-- 
    Document   : AdminLogout
    Created on : Mar 28, 2020, 12:08:17 AM
    Author     : Mr Loi Ho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multiple Choise</title>
    </head>
    <body>
        <h1>Welcome to admin logout page</h1>
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
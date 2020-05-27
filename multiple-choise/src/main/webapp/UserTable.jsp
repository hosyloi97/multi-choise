<%-- 
    Document   : showEmps
    Created on : Aug 2, 2019, 8:36:26 AM
    Author     : Mr Loi Ho
--%>

<%@page import="sic.hust.multiple.choise.model.User"%>
<%@page import="sic.hust.multiple.choise.service.impl.PersonServiceImp"%>
<%@page import="sic.hust.multiple.choise.service.impl.QuestionServiceImpl"%>
<%@page import="sic.hust.multiple.choise.model.Question"%>
<%@page import="sic.hust.multiple.choise.service.impl.ExamServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="sic.hust.multiple.choise.model.Exam"%>
<%@page import="sic.hust.multiple.choise.dao.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- css icon -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
              integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

        <title>Manage User</title>

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!-- Custom styles for this template -->
        <!--<link href="css/login.css" rel="stylesheet">-->
    </head>

    <body>

        <!-- =============================  Header menu of page  ============================= -->
        <%@include file="../jsp/HeaderMenuUser.jsp" %>
        <div class="container" style="background-color: #ccc">
            <br/>
            <br/>
            <br/>
            <%
                PersonServiceImp service = new PersonServiceImp();
                List<User> users = service.findAllUser();
                int i = 1;
            %>
            <div class="col-lg-9">
                <center style="color: SlateBlue;">
                    <h2>This is the list users</h2>
                </center>
            </div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tr>
                    <% for (User user : users) {%>

                    <td><%= i%></td>
                    <td><%= user.getNameUser()%></td>
                    <td><%= user.getEmail()%></td>
                    <td><button type="button" class="btn btn-danger">Delete</button></td>
                </tr>
                <%
                        i++;
                    }
                %>

            </table>
        </div>
    </body>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script></body>
    <%@include file="../jsp/Footer.jsp" %>
</html>

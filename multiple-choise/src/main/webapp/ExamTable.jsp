<%-- 
    Document   : showEmps
    Created on : Aug 2, 2019, 8:36:26 AM
    Author     : Mr Loi Ho
--%>

<%@page import="sic.hust.multiple.choise.model.Question"%>
<%@page import="sic.hust.multiple.choise.service.impl.ExamServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="sic.hust.multiple.choise.model.Exam"%>
<%@page import="sic.hust.multiple.choise.dao.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet"
              href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
              integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
              crossorigin="anonymous">
    </head>

    <script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

    <title>List employees</title>
</head>
<body>
    <div class="container">
        <%
            ExamServiceImpl service = new ExamServiceImpl();
            Exam exam = service.findExamById(1);
        %>
        <div class="col-lg-9">
            <center style="color: SlateBlue;">
                <h2>This is the Exam <% exam.getName();%> </h2>
            </center>
        </div>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Option A</th>
                    <th>Option B</th>
                    <th>Option C</th>
                    <th>Option D</th>
                    <th>Answer</th>
                </tr>
            </thead>
            <tr>
                <% for (Question question : exam.getListQuestions()) {%>

                <td><%= question.getTitle()%></td>
                <td><%= question.getOptionA()%></td>
                <td><%= question.getOptionB()%></td>
                <td><%= question.getOptionC()%></td>
                <td><%= question.getOptionD()%></td>
                <td><%= question.getAnswer()%></td>
            </tr>
            <%
                }
            %>

        </table>
    </div>
</div>
</div>
</div>

</body>
</html>

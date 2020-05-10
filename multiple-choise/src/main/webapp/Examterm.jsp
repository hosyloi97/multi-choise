<%-- 
    Document   : Exam
    Created on : May 10, 2020, 10:15:12 AM
    Author     : Mr Loi Ho
--%>

<%@page import="java.util.List"%>
<%@page import="sic.hust.multiple.choise.model.Question"%>
<%@page import="sic.hust.multiple.choise.model.Exam"%>
<%@page import="sic.hust.multiple.choise.service.impl.ExamServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Page Title</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <%
                ExamServiceImpl service = new ExamServiceImpl();
                Integer id = Integer.parseInt(session.getAttribute("id").toString());
                System.out.println(id);
                Exam exam = service.findExamById(id);
                int i = 1;
            %>
            <h4>Exam <%= exam.getName()%> </h4>
            <form>
                <% for (Question question : exam.getListQuestions()) {%>

                <div class="form-group row">
                    <label class="col-sm-2">Câu hỏi số: <%= i%> </label>
                    <div class="col-sm-10">
                        <div class="radio">
                            <label>
                                <%= question.getTitle()%>
                            </label>
                        </div>
                        <div>
                            <label>
                                <input type="radio" name="gridRadios" id="optionA">
                                <%= question.getOptionA()%>
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="gridRadios" id="optionB">
                                <%= question.getOptionB()%>
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="gridRadios" id="optionC">
                                <%= question.getOptionC()%>
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="gridRadios" id="optionD">
                                <%= question.getOptionD()%>
                            </label>
                        </div>

                    </div>
                </div>
                <%i++;
                }%>

            </form>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script></body>
</html>
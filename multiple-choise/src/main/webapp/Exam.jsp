<%@page import="java.util.List"%>
<%@page import="sic.hust.multiple.choise.model.Question"%>
<%@page import="sic.hust.multiple.choise.model.Exam"%>
<%@page import="sic.hust.multiple.choise.service.impl.ExamServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- css icon -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
              integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

        <title>Exam</title>

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!-- Custom styles for this template -->
        <!--<link href="css/login.css" rel="stylesheet">-->
    </head>

    <body>

        <!-- =============================  Header menu of page  ============================= -->
        <%@include file="../jsp/HeaderMenuGuest.jsp" %>

        <div class="container" style="background-color: #ccc">
            <br/>
            <br/>
            <br/>
            <%
                ExamServiceImpl service = new ExamServiceImpl();
                Integer id = Integer.parseInt(session.getAttribute("id").toString());
                System.out.println(id);
                Exam exam = service.findExamById(id);
                int i = 1;
                boolean check = false;
            %>
            <h3 style="text-align: center; color: blue"> <%= exam.getName()%> </h3>
            <br/>
            <form>
                <% for (Question question : exam.getListQuestions()) {
                        String nameRadio = "radio" + question.getId();
                %>

                <div class="form-group row">
                    <label class="col-sm-2">Câu hỏi số: <%= i++%> </label>
                    <div class="col-sm-10">
                        <div class="radio">
                            <label>
                                <%= question.getTitle()%>
                            </label>
                        </div>
                        <div>
                            <label>
                                <input type="radio" name=<%=nameRadio%> id="optionA">
                                <%= question.getOptionA()%>
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name=<%=nameRadio%> id="optionB">
                                <%= question.getOptionB()%>
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name=<%=nameRadio%> id="optionC">
                                <%= question.getOptionC()%>
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name=<%=nameRadio%> id="optionD">
                                <%= question.getOptionD()%>
                                
                            </label>
                        </div>
                        <div>
                            <label hidden="false">
                                <input type="text">
                                <%= question.getAnswer()%>
                            </label>
                        </div>
                    </div>
                </div>
                <% }%>
                <button type="button" class="btn btn-primary" style="margin-left: 186px; margin-bottom: 20px">Submit</button>
            </form>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script></body>
        <%@include file="../jsp/Footer.jsp" %>

</html>
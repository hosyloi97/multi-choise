<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="jumbotron">
        <div class="col-sm-8 mx-auto">
            <h4>Welcome to admin page </h4>
            <h4>Chào mừng các bạn đã đến với Multiple Choise- Hệ thống ôn thi Lịch sử bằng hình thức trắc nghiệm đẳng cấp thế giới.</h4>
            <a href="ExamTable.jsp">Manage Exam</a> <br/> <br/>
            <a href="QuestionTable.jsp">Manage Question</a> <br/><br/>
            <a href="UserTable.jsp">Manage User</a> <br/> <br/>

        </div>
    </div>
</div>
<%
    if (session.getAttribute("name") == null) {
        response.sendRedirect("Login.jsp");
    }
%>
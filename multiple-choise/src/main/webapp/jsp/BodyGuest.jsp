<%@page import="java.util.List"%>
<%@page import="sic.hust.multiple.choise.model.Exam"%>
<%@page import="sic.hust.multiple.choise.service.impl.ExamServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="jumbotron">
        <div class="col-sm-8 mx-auto">
            <h4>Chào mừng các bạn đã đến với Multiple Choise- Hệ thống ôn thi Lịch sử bằng hình thức trắc nghiệm đẳng cấp thế giới.</h4>
            <p>This is our list of exams: 
                <% ExamServiceImpl service = new ExamServiceImpl();
                    List<Exam> exams = service.findAllExams();
                    for (Exam exam : exams) {
                        String url = "/multiChoise/showExam?id=" + exam.getId();
                %>
                <br/>
                <a href=<%=url%> > Exam: <%=exam.getName()%></a>
                <% }%>
        </div>
    </div>
</div>
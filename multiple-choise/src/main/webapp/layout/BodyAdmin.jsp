 <%@page contentType="text/html" pageEncoding="UTF-8"%>
         <div class="container">
             <div class="jumbotron">
                 <div class="col-sm-8 mx-auto">
                 <h4>Welcome to admin page </h4>
                     <h4>Chào mừng các bạn đã đến với Multiple Choise- Hệ thống ôn thi Lịch sử bằng hình thức trắc nghiệm đẳng cấp thế giới.</h4>
                     <p>This example is a quick exercise to illustrate how the navbar and its contents work. Some navbars extend the width of the viewport, others are confined within a <code>.container</code>. For positioning of navbars, checkout the <a href="../navbar-top/">top</a> and <a href="../navbar-top-fixed/">fixed top</a> examples.</p>
                     <p>At the smallest breakpoint, the collapse plugin is used to hide the links and show a menu button to toggle the collapsed content.</p>
                     <p>
                         <a class="btn btn-primary" href="../../components/navbar/" role="button">View navbar docs &raquo;</a>
                     </p>
                 </div>
             </div>
         </div>
 <%
           if (session.getAttribute("name") == null){
                response.sendRedirect("Login.jsp");
            }
        %>
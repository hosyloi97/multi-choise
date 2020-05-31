<%@page import="java.util.ArrayList"%>
<%@page import="sic.hust.multiple.choise.model.Topic"%>
<%@page import="java.util.List"%>
<%@page import="sic.hust.multiple.choise.service.impl.TopicServiceImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer class="page-footer font-small mdb-color pt-4 bg-secondary">
    <!-- Footer Links -->
    <div class="container text-center text-md-left">

        <!-- Footer links -->
        <div class="row text-center text-md-left mt-3 pb-3">

            <!-- Grid column -->
            <div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
                <h6 class="text-uppercase mb-4 font-weight-bold">Multiple Choise</h6>
                <p>Chào mừng các bạn đã đến với Multiple Choise- Hệ thống ôn thi Lịch sử bằng hình thức trắc nghiệm.
                    Với khẩu hiệu "Sự hài lòng của bạn - Chúng tôi ngày hôm nay", sẽ không bao giờ các bạn phải hối hận khi đã đặt niềm tin vào chúng tôi.</p>
            </div>
            <!-- Grid column -->

            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->
            <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
                <h6 class="text-uppercase mb-4 font-weight-bold">Chủ đề</h6>
                <% TopicServiceImpl sv = new TopicServiceImpl();
                List<Topic> topics = sv.findAllTopics();
                for (Topic topic : topics) {
                %>
                <a href="#"> <%=topic.getName() %> </a>
                <br/>
                <% } %>
            </div>
            <!-- Grid column -->

            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->
            <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mt-3">
                <h6 class="text-uppercase mb-4 font-weight-bold">Useful links</h6>
                <p>
                    <a href="#!">Film</a>
                </p>
                <p>
                    <a href="#!">Anime</a>
                </p>
                <p>
                    <a href="#!">Music</a>
                </p>
                <p>
                    <a href="#!">Art</a>
                </p>
            </div>

            <!-- Grid column -->
            <hr class="w-100 clearfix d-md-none">

            <!-- Grid column -->
            <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
                <h6 class="text-uppercase mb-4 font-weight-bold">Liên hệ:</h6>
                <p>
                    <i class="fas fa-home mr-3"></i> Hanoi, Hust k60, VN</p>
                <p>
                    <i class="fas fa-envelope mr-3"></i> infor@multiplechoise.com</p>
                <p>
                    <i class="fas fa-phone mr-3"></i> + 01 234 567 88</p>
                <p>
                    <i class="fas fa-print mr-3"></i> + 01 234 567 89</p>
            </div>
        </div>
        <hr>
        <!-- Grid row -->
        <div class="row d-flex align-items-center">

            <!-- Grid column -->
            <div class="col-md-7 col-lg-8">

                <!--Copyright-->
                <p class="text-center text-md-left" style="padding-left: 25px">  © Copyright 2020 :
                    <a href="index.html">
                        <strong> MultipleChoise.com</strong>
                    </a> All Rights Reserved. Privacy Policy.
                </p>

            </div>
            <div class="col-md-5 col-lg-4 ml-lg-0">
                <!-- Social buttons -->
                <div class="text-center text-md-right">
                    <ul class="list-unstyled list-inline" style="float: left; padding-left: 60px;">
                        <li class="list-inline-item">
                            <a class="btn-floating btn-sm rgba-white-slight mx-1" href="https://www.facebook.com/">
                                <i class="fab fa-facebook-f"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a class="btn-floating btn-sm rgba-white-slight mx-1" href="https://twitter.com/home">
                                <i class="fab fa-twitter"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a class="btn-floating btn-sm rgba-white-slight mx-1" href="https://www.google.com/">
                                <i class="fab fa-google-plus-g"></i>
                            </a>
                        </li>
                        <li class="list-inline-item">
                            <a class="btn-floating btn-sm rgba-white-slight mx-1" href="https://www.linkedin.com/">
                                <i class="fab fa-linkedin-in"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</footer>
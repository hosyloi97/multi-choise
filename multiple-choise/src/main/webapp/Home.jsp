<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- css icon -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
              integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

        <title>Multiple Choise</title>

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>

        <!-- =============================  Header of page  ============================= -->
        <div class id="header">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
                <div class="container">
                    <a class="navbar-brand" href="#">Multiple Choise</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar_menu" aria-controls="navbar_menu" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbar_menu">
                        <ul class="navbar-nav col-lg-5">
                            <li class="nav-item active">
                                <a class="nav-link" href="#">Trang chủ<span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Giới thiệu</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Bảng xếp hạng</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="topic" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Chủ đề</a>
                                <div class="dropdown-menu" aria-labelledby="topic">
                                    <a class="dropdown-item" href="#">Lịch sử Việt Nam</a>
                                    <a class="dropdown-item" href="#">Lịch sử thế giới</a>
                                </div>
                            </li>
                        </ul>
                        <form class="form-inline col-sm-4">
                            <input class="form-control" type="text" placeholder="Search" aria-label="Search">
                        </form>
                        <div class="col-sm-4">
                            <button type="button" class="btn btn-info">Đăng ký</button>
                            <a href="./Login.jsp">
                                <button type="button" class="btn btn-danger">Đăng nhập</button>
                            </a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>


        <!-- ============================= body of page ============================= -->
        <div class="container">
            <div class="jumbotron">
                <div class="col-sm-8 mx-auto">
                    <h4>Chào mừng các bạn đã đến với Multiple Choise- Hệ thống ôn thi Lịch sử bằng hình thức trắc nghiệm đẳng cấp thế giới.</h4>
                    <p>This example is a quick exercise to illustrate how the navbar and its contents work. Some navbars extend the width of the viewport, others are confined within a <code>.container</code>. For positioning of navbars, checkout the <a href="../navbar-top/">top</a> and <a href="../navbar-top-fixed/">fixed top</a> examples.</p>
                    <p>At the smallest breakpoint, the collapse plugin is used to hide the links and show a menu button to toggle the collapsed content.</p>
                    <p>
                        <a class="btn btn-primary" href="../../components/navbar/" role="button">View navbar docs &raquo;</a>
                    </p>
                </div>
            </div>
        </div>

        <!-- ============================= footer of page ============================= -->


        <!-- Bootstrap core JavaScript================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
    <footer class="page-footer font-small mdb-color pt-4 bg-secondary">
        <!-- Footer Links -->
        <div class="container text-center text-md-left">

            <!-- Footer links -->
            <div class="row text-center text-md-left mt-3 pb-3">

                <!-- Grid column -->
                <div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
                    <h6 class="text-uppercase mb-4 font-weight-bold">Multiple Choise</h6>
                    <p>Chào mừng các bạn đã đến với Multiple Choise- Hệ thống ôn thi Lịch sử bằng hình thức trắc nghiệm đẳng cấp thế giới.
                        Với sứ mệnh biến bạn từ siêu ngu thành bá cmn đạo môn Lịch sử, chúng tôi sẽ chắp cánh cho ước mơ của bạn.</p>
                </div>
                <!-- Grid column -->

                <hr class="w-100 clearfix d-md-none">

                <!-- Grid column -->
                <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
                    <h6 class="text-uppercase mb-4 font-weight-bold">Chủ đề</h6>
                    <p>
                        <a href="#!">Lịch sử Việt Nam</a>
                    </p>
                    <p>
                        <a href="#!">Lịch sử thế giới</a>
                    </p>

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
                                <a class="btn-floating btn-sm rgba-white-slight mx-1" href="index.html">
                                    <i class="fab fa-facebook-f"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a class="btn-floating btn-sm rgba-white-slight mx-1" href="index.html">
                                    <i class="fab fa-twitter"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a class="btn-floating btn-sm rgba-white-slight mx-1" href="index.html">
                                    <i class="fab fa-google-plus-g"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a class="btn-floating btn-sm rgba-white-slight mx-1" href="index.html">
                                    <i class="fab fa-linkedin-in"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</html>
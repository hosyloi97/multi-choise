<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class id="header">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
            <a class="navbar-brand" href="/multiChoise/">Multiple Choise</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar_menu" aria-controls="navbar_menu" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbar_menu">
                <ul class="navbar-nav col-lg-5">
                    <li class="nav-item active">
                        <a class="nav-link" href="/multiChoise/">Trang chủ<span class="sr-only">(current)</span></a>
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
                <div class="form-inline col-sm-4">
                    <form action= "logout" method="GET">
                        <input type= "submit" class="btn btn-danger" value="Đăng xuất">
                    </form>
                    <!--User-->
                </div>
            </div>
        </div>
    </nav>
</div>
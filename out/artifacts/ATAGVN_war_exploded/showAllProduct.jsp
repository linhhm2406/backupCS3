<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ATAG.VN</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <link rel="stylesheet" href="boostrap/css/bootstrap.css">
    <link rel="stylesheet" href="boostrap/css/mainStyle.css">
</head>
<body>


<%--HEADER--%>
<header class="header-section">
    <div class="container-fluid">
        <div class="inner-header">
            <div class="logo">
                <a href="./index.jsp"><img src="img/logo.png" alt="logo"></a>
            </div>
            <div class="header-right">
                <i class="fa fa-search"></i>
                <i class="fa fa-user"></i>
                <a href="#">
                    <i class="fa fa-shopping-bag"></i>
                    <span>2</span>
                </a>
            </div>
            <div class="user-access">
                <a href="#">Register</a>
                <a href="#" class="in">Sign in</a>
            </div>
            <nav class="main-menu mobile-menu">
                <ul>
                    <li><a class="active" href="./index.html">Home</a></li>
                    <li><a href="./categories.html">Category</a>
                        <ul class="sub-menu">
                            <li><a href="product-page.html">Samsung</a></li>
                            <li><a href="shopping-cart.html">Apple</a></li>
                        </ul>
                    </li>
                    <li><a href="./product-page.html">About</a></li>
                    <li><a href="./check-out.html">Blog</a></li>
                    <li><a href="./contact.html">Contact</a></li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<div class="header-info">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 text-center">
                <div class="header-item">
                    <i class="fa fa-helicopter"></i>
                    <p>Free shipping 99K</p>
                </div>
            </div>
            <div class="col-md-4 text-center">
                <div class="header-item">
                    <i class="fa fa-gift"></i>
                    <p>Opening discount Upto 90%</p>
                </div>
            </div>
            <div class="col-md-4 text-center">
                <div class="header-item">
                    <i class="fa fa-gift"></i>
                    <p>Free for CodeGym Student</p>
                </div>
            </div>
        </div>
    </div>
</div>


<%--SLIDE BAR--%>
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="carousel-item active" style="background-image: url('img/slideBar1.png')">
            <div class="carousel-caption d-none d-md-block">
                <h2 class="display-4" id="banner1MainText">iPhone</h2>
                <p class="lead" id="banner1SubText">For the next World's Generation</p>
            </div>
        </div>
        <div class="carousel-item" style="background-image: url('img/slideBar2.png')">
            <div class="carousel-caption d-none d-md-block">
                <h2 class="display-4" id="banner2MainText">Samsung Galaxy S20+</h2>
                <p class="lead" id="banner2SubText">Beyond imagination.</p>
            </div>
        </div>
        <div class="carousel-item" style="background-image: url('img/slideBar3.png')">
            <div class="carousel-caption d-none d-md-block">
                <h2 class="display-4" id="banner3MainText">Galaxy Accessory</h2>
                <p class="lead" id="banner3SubText">The best experience</p>
            </div>
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<hr>

<%--BODY--%>

<div class="container">
    <div class="categoryName" style="margin-bottom: 20px">
        <h3>SAMSUNG</h3>
    </div>
    <div class="cf-left" style="margin-bottom: 20px">
        <form action="#">
            <select class="sort">
                <option value="">Sort by</option>
                <option value="">Price (Lowest first)</option>
                <option value="">Price (Highest first)</option>
            </select>
        </form>
    </div>
    <div class="productListShow" style="margin: 30px">

<%--        Vòng lặp ở đây để show lần lượt tất cả sản phẩm--%>

        <div style="padding-top: 40px; padding-bottom: 60px">
            <table style="margin-bottom: 60px">
                <tr>
                    <td rowspan="3"><img class="card-img-top" src="img/phone1.png" style="height: 100%;width: 100%">
                    </td>
                    <td><h4>OPPO RENO3 PRO</h4></td>
                </tr>
                <tr>
                    <td style="vertical-align: top; color: red">Giá bán : 12.990.000₫</td>
                </tr>
                <tr>
                    <td style="line-height:25px; vertical-align: top">MÀN HÌNH ĐỤC LỖ KÉP ĐỘC ĐÁO : Sáng tạo và khác
                        biệt <br>
                        CAMERA SELFIE KÉP ĐÊM 44MP + 2MP : Xuất hiện đầu tiên trên thế giới <br>
                        4 CAMERA 64MP ẢNH SIÊU NÉT 108MP <br>
                        SẠC NHANH <br>
                        HIỆU NĂNG CẢI TIẾN MẠNH MẼ <br>
                    </td>
                </tr>
            </table>
            <br>
            <hr style="width: 800px">
        </div>
    </div>
</div>

<%--FOOTER--%>
<footer class="footer-section spad">
    <div class="container">
        <div class="footer-widget">
            <div class="row">
                <div class="col-lg-3 col-sm-6">
                    <div class="single-footer-widget">
                        <h4>About us</h4>
                        <ul>
                            <li>CodeGym BC Java Mod 3</li>
                            <li>. Bui Duc Thinh (Leader)</li>
                            <li>. Nguyen Thai Binh</li>
                            <li>. Bui Xuan Huynh</li>
                            <li>. Hoang Manh Linh</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="single-footer-widget">
                        <h4>Customer Care</h4>
                        <ul>
                            <li>Guarantee Center</li>
                            <li>Shipping & Delivery</li>
                            <li>Gallery</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="single-footer-widget">
                        <h4>Our Services</h4>
                        <ul>
                            <li>Free Shipping</li>
                            <li>Free Returning</li>
                            <li>Terms and conditions</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="single-footer-widget">
                        <h4>Information</h4>
                        <ul>
                            <li>Payment methods</li>
                            <li>Times and shipping costs</li>
                            <li>Product Returns</li>
                            <li>Shipping methods</li>
                            <li>Conformity of the products</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="social-links-warp">
        <div class="container">
            <div class="social-links">
                <a href="" class="instagram"><img src="img/instagram.PNG"><span> instagram</span></a>
                <a href="" class="pinterest"><img src="img/facebook.PNG"><span> facebook</span></a>
                <a href="" class="facebook"><img src="img/twitter.PNG"><span> twitter</span></a>
                <a href="" class="twitter"><img src="img/youtube.PNG"><span> youtube</span></a>
                <a href="" class="twitter"><p><b>GookLuck & Thank you all!!!</b></p></a>
            </div>
        </div>
    </div>
</footer>

</body>
</html>
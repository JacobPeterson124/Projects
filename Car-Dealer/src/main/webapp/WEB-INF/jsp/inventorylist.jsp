<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Inventorylist</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="#">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

    <!-- CSS here -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/flaticon.css">
        <link rel="stylesheet" href="assets/css/slicknav.css">
        <link rel="stylesheet" href="assets/css/animate.min.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>

    <!-- slider Area Start-->
    <div class="slider-area ">
        <!-- Mobile Menu -->
        <div class="single-slider slider-height2 d-flex align-items-center" data-background="assets/img/Unicorn-users.jpeg">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hero-cap text-center">
                            <h2 class="text-white" >Inventory List<i class= "fa fa-users" aria-hidden="true"></i></h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- slider Area End-->

    <!--================login_part Area =================-->
    <section class="login_part section_padding ">
        <div class="container">
            <div class="row align-items-center">
            <c:choose>
<c:when test="${not empty inventorylist}">
<input type="text" placeholder="Search.." class="form-control">
<table class="table table-striped table-hover" >
<thead>
<tr class="text-info">

<th colspan="1">

</th>
<th><br>
Year
</th>
<th><br>
Make
</th>
<th><br>
Model
</th>
<th><br>
Mileage
</th>
<th><br>
Vin.
</th>
<th><br>
Price
</th>
</tr>
</thead>
<tbody>
<c:forEach var="item" items="${inventorylist}">
<tr>
<td>${inventorylist.indexOf(item)+1}.</td>
<td>${item.year}</td>
<td>${item.make}</td>
<td>${item.model}</td>
<td>${item.mileage}</td>
<td>${item.vinNum}</td>
<td>${item.price}</td>
</tr>
</c:forEach>
</tbody>
</table>
</c:when>
<c:otherwise>
<h3>No inventory found</h3>
</c:otherwise>
</c:choose> 
                
            </div>
        </div>
    </section>
    <!--================login_part end =================-->

    



</body>
    
</html>

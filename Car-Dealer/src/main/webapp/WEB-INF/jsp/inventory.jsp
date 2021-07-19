<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Add to Inventory</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
  </head>


<body class="text-center">
  <ul>
  <li ><a class="glyphicon glyphicon-log-in" 
href="/login">Logout</a></li>

  
</ul>

    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand text-info">Add Car to Inventory!</h3>
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link active" href="index">Home</a>
        <a class="nav-link" href="#">Features</a>
        <a class="nav-link" href="#">Contact</a>
      </nav>
    </div>
  </header>

  <main role="main" class="inner cover">
     
     
<form:form  action ="/inventory" modelAttribute = "Car" post ="method"> 

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputyear">Year</label>
      <form:input path="year" type ="text" class="form-control" id="inputyear"/>
    </div>
    <div class="form-group col-md-6">
      <label for="inputmake">Make</label>
      <form:input path="make" type = "text" class="form-control" id="inputmake"/>
    </div>
  </div>
  
  
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputmodel4">Model</label>
      <form:input path="model" type = "text" class="form-control" id="inputmodel4"/>
   
  </div>
  
  
    <div class="form-group col-md-6">
      <label for="inputmileage4">mileage</label>
      <form:input path="mileage" type = "text" class="form-control" id="inputmileage4"/>
    </div>
  </div>
  
   <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputvinNum4">Vin. Number</label>
      <form:input path="vinNum" type = "text" class="form-control" id="inputvinNum4"/>
   
  </div>
  
  
    <div class="form-group col-md-6">
      <label for="inputprice4">Price</label>
      <form:input path="price" type = "text" class="form-control" id="inputprice4"/>
    </div>
  </div>

  <button type="submit" class="btn btn-primary">Add Car!</button>
</form:form>


  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Car sales for <a href="https://getbootstrap.com/">Car buyers</a>, by <a href="https://twitter.com/mdo">@cars</a>.</p>
    </div>
  </footer>
</div>


</body>

</html>
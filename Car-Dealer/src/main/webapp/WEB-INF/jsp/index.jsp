<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>index</title>

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
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class= "masthead-brand text-info"  >CAR-A-PALOOZA</h3>
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link active" href="inventory">Add Car to Inventory</a>
        <a class="nav-link" href="login">login</a>
        <a class="nav-link" href="sign-up">sign-up</a>
      </nav>
    </div>
  </header>

  <main role="main" class="inner cover">
    <h1 class="cover-heading text-danger">One Stop Car Shop</h1>
    <p class="lead">A plethora of cars with pin-point pricing!</p>
    <p class="lead">
      <a href="/inventorylist" class="btn btn-lg btn-primary text-white">View Inventory</a>
    </p>
  </main>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Car sales by:<a href="https://getbootstrap.com/">car owners</a>, by <a href="https://twitter.com/mdo">@cars</a>.</p>
    </div>
  </footer>
</div>


</body>

</html>
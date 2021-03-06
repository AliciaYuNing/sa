<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">


<title>Home</title>
</head>

<%@include file="navbar_cus.jsp"%>

<!-- Page Content -->
<div class="w3-padding-large" id="main">
	<!-- Header/Home -->
	<header class="w3-container w3-padding-32 w3-center w3-black" id="home">
		<h1 class="w3-jumbo">
			<span class="w3-hide-small"></span> Home
		</h1>
	</header>

	<body>
		<div class="container theme-showcase" role="main">
		 <div class="container">
			<div class="row">
			<div class='box'>
			<div class="row">
			<c:forEach items="${productList}" var="product">
			 <div class="col-sm-4 col-md-4">
			 <div class="thumbnail" style="border: 0;">
		      <img src="resources//fileUpload//${product.id}.jpg" style="width: 300px; height: 300px;"></a>
			   <div class="caption">
			    <p>${product.id} ${product.desc} ${product.price}    </p>
						<p>
						 <a class="fa fa-eye fa-2x" aria-hidden="true" href="home">查看商品細節 </a> <%--這裡的home表示按下button時要回傳給controller的值 --%> 
						 <%--之後要連上商品細項的jsp改這裡的href --%>
						 <a class="fa fa-shopping-cart fa-2x" aria-hidden="true" href="AddShoppingCar?id=${product.id}">加入購物車</a>
						</p>
										</div>
									</div>
								</div>
							</c:forEach>
							<br>


						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.container -->
		<!-- Bootstrap core JavaScript================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	</body>
</html>

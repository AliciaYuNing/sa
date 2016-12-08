<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<!DOCTYPE html>
<html>
<%@include file="navbar_cus.jsp" %>


<!-- Page Content -->
<div class="w3-padding-large" id="main">
  <!-- Header/Home -->
  <header class="w3-container w3-padding-32 w3-center w3-black" id="home">
     <h1 class="w3-jumbo"><span class="w3-hide-small"></span> Home</h1>
  </header>

<body>
	<div class="container theme-showcase" role="main">
		<div class="jumbotron">
			<%-- <h1>產品管理系統</h1> --%>
		</div>
		<div class="form-group">
			分類:<select class="form-control" name="category_id"
				value=${product.category_id}>
				 <option>xx</option>
				<option>xx</option>
				<option>依價格排序</option>
			</select> <a class="btn btn-sm btn-danger deleteBtn" href="pricesearch">確定</a>

		</div>

	<div class="container">
	<!--  -->
	<div class="row">
		<div class='box'>
			<div class="row">
				<c:forEach items="${productList}" var="product2">
					<div class="col-sm-4 col-md-4">
					<div class="thumbnail" style="border: 0;">
						<a href="profile"><img
						   src="resources//fileUpload//${product2.id}.jpg"
						   style="width: 300px; height: 300px;"></a>
		</td> 
						<p>${product.price}</p>
					<div class="caption">
						<p>${product.id}</p>
						<a href="product">${product.desc}</a>
						<p>
						 <a href="product" class="btn btn-primary" role="button">Button</a>
						 
						</p>
					</div>
					</div>
					</div>
			  </c:forEach> <br>
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

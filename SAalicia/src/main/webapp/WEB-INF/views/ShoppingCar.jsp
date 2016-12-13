<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<!DOCTYPE html>
<html>
<%@include file="navbar_cus.jsp" %>

<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    
</head>

<!-- Page Content -->
<div class="w3-padding-large" id="main">
  <!-- Header/Home -->
  <header class="w3-container w3-padding-32 w3-center w3-black" id="home">
     <h1 class="w3-jumbo"><span class="w3-hide-small"></span> Shopping Car</h1>
  </header>
<body>
  <div class="container theme-showcase" role="main">
    <div class="container">
		<div class="row"><br>
		<div class="col-md-12">
	  <table class="table">
		<tr>		
		 <th>購物車編號</th>
		 <th>商品編號</th>
		 <th>類別</th>
		 <th>商品名稱</th>
		 <th>價格</th>
		</tr>
		  <c:forEach items="${productList}" var="product" varStatus="status">
		    <tr>
		    <td>${status.index+1}</td>
		     <td>${product.id}</td>
			 <td>${product.category}</td>
			 <td>${product.desc}</td>
			 <td>${product.price}</td>
			 <%-- <td><a class="btn btn-sm btn-danger deleteBtn" href="deletesShoppingCar?id=${status.index+1}">刪除</a>  --%>     
			<td><a class="btn btn-sm btn-danger deleteBtn" href="deletesShoppingCar?id=${status.index+1}">刪除</a>
			</tr>
			    
		  </c:forEach>
		  
		  
		     
		</table>
			<a class="btn btn-sm btn-danger deleteBtn" href="CheckOut">結帳</a>
			</div>
		</div>
	</div>
  </div>
  
  
  
  
  
  
  
  
  
</body>

   

</html>

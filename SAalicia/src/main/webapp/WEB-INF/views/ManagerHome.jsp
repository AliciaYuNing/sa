<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
.w3-sidenav a,.w3-sidenav h4 {font-weight:bold}
</style>
<body class="w3-black">
 <%--================================================================================ --%>
  <!-- Page Content -->
<div class="w3-padding-large" id="main">
  <!-- Header/Home -->
  <header class="w3-container w3-padding-32 w3-center w3-black" id="home">
     <h1 class="w3-jumbo"><span class="w3-hide-small"></span> Manager Home Page</h1>
  </header>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <!-- First Photo Grid-->
  <div class="w3-row-padding">
    <div class="w3-quarter">
     <a class="w3-padding-large w3-hover-black" href="SalesOrderList">
       <i class="fa fa-calendar-check-o fa-4x" aria-hidden="true"></i> 
       <p>銷售訂單</p>
     </a>
     </div>
    <%--      --%>
    <div class="w3-quarter">
     <a class="w3-padding-large w3-hover-black" href="ShippingList">
       <i class="fa fa-truck fa-4x" aria-hidden="true"></i> 
       <p> 出貨單</p>
     </a>
     </div>
    <%-- --%>
    <div class="w3-quarter">
     <a class="w3-padding-large w3-hover-black" href="InventoryList">
       <i class="fa fa-suitcase fa-4x" aria-hidden="true"></i> 
       <p> 存貨單</p>
     </a>
     </div>
    <%--   --%>
    <div class="w3-quarter">
     <a class="w3-padding-large w3-hover-black" href="CusServiceList">
       <i class="fa fa-envelope-o fa-4x" aria-hidden="true"></i> 
       <p> 客服單</p>
     </a>
     </div>
  </div>
    









   

</html>
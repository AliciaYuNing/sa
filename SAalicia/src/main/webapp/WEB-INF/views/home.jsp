<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1,h2,h3,h4,h5,h6 {font-family: "Montserrat", sans-serif}
.w3-row-padding img {margin-bottom: 12px}
/* Set the width of the sidenav to 120px */
.w3-sidenav {width: 120px;background: #222;}
/* Add a left margin to the "page content" that matches the width of the sidenav (120px) */
#main {margin-left: 120px}
/* Remove margins from "page content" on small screens */
@media only screen and (max-width: 600px) {#main {margin-left: 0}}
</style>

<body class="w3-black">

<!-- Icon Bar (Sidenav - hidden on small screens) -->
 <nav class="w3-sidenav w3-center w3-small w3-hide-small">
  <!-- Avatar image in top left corner --><br><br><br>
  
  <a class="w3-padding-large w3-black" href="#">
    <i class="fa fa-home w3-xxlarge"></i>
    <p>首頁</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="#about">
    <i class="fa fa-user w3-xxlarge"></i> <%--人頭小圖片 --%>
    <p>耳機</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="#photos">
    <i class="fa fa-eye w3-xxlarge"></i><%--眼睛小圖片 --%>
    <p>滑鼠</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="#contact">
    <i class="fa fa-envelope w3-xxlarge"></i><%--email小圖片 --%>>
    <p>行動電源</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="#about">
    <i class="fa fa-user w3-xxlarge"></i><%--人頭小圖片 --%>>
    <p>手機</p>
  </a>
</nav>

<!-- Page Content -->
<div class="w3-padding-large" id="main">
  <!-- Header/Home -->
  <header class="w3-container w3-padding-32 w3-center w3-black" id="home">
    <h1 class="w3-jumbo"><span class="w3-hide-small"></span> Home.</h1>
    <p>Electronic Seller.</p>
     
     <h2>Sells Order List</h2>
    <head>
  <style>
        table { border-collapse: collapse;
           }

         table, td, th { border: 100px solid black;
           }     <%--表單規格大小--%>
  </style>
  
</head>
<body>
  <table>
       <tr>
             <th>訂單編號</th>
             <th>總金額</th>
             <th>訂單狀態</th>
             <th>地址</th>
            
        </tr>
   
  </table>
    
    
    
    <%--<img src="/w3images/man_smoke.jpg" alt="boy" class="w3-image" width="992" height="1108">--%>
  </header>

</body>
</html>

<%--<head>
	<title>Home</title>
</head>
<body>
<h1>
	             Testing Home Page  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>--%>

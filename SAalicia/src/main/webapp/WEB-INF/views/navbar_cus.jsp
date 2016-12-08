<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<!DOCTYPE html>
<html>
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
  <!-- Avatar image in top left corner -->
  <img src="/w3images/avatar_smoke.jpg" style="width:100%">
  <a class="w3-padding-large w3-black" href="home"><%--這裡的home表示按下button時要回傳給controller的值 --%>
    <i class="fa fa-home fa-3x"></i>
    <p>首頁</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="SignIn">
    <i class="fa fa-user-circle-o fa-3x" aria-hidden="true"></i>
    <p>登入/註冊</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="Mobilephone">
    <i class="fa fa-mobile fa-3x" aria-hidden="true"></i>
    <p>手機</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="Audioeq">
    <i class="fa fa-music fa-3x" aria-hidden="true"></i>
    <p>音響</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="Charger">
    <i class="fa fa-battery-full fa-2x"></i>
    <p>行充</p>
  </a>
  <a class="w3-padding-large w3-hover-black" href="Mouse">
    <i class="fa fa-mouse-pointer fa-2x" aria-hidden="true""></i>
    <p>滑鼠</p>
  </a>
</nav>
</html>




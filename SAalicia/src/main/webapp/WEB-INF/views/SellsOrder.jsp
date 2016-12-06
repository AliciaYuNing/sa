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




<html>
<head>
  <style>
        table { border-collapse: collapse;
           }

         table, td, th { border: 10px solid black;
           }
  </style>
  
  <style>
        .button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
           }
        .button4 {border-radius: 2px;}

  </style>
</head>
<body>
      <h2>Sells Order List</h2>

  <table>
         <tr>
             <th>訂單編號</th>
             <th>總金額</th>
             <th>訂單狀態</th>
             <th>地址</th>
             <th>    </th>
        </tr>
    <c:forEach items="${SellsOrderList}" var="order">
		<tr>
		<img src="resources//fileUpload//${product.id}.jpg" width="30%"></td>
                 <td>${order.id}</td>
				 <td>${order.total}</td>
				 <td>${order.state}</td>
				 <td>${order.address}</td>
                <td><a class="btn btn-default"href="addShoppingCart?id=${product.id}">放入購物車</a></td>

                 <p><b><a href="default.asp" target="_blank">出貨</a></b></p>

				 
		</tr>
	</c:forEach>
   
  </table>

<p><b>Note:</b></p>

</body>
</html>


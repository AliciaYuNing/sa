<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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


<%--
  Created by IntelliJ IDEA.
  User: syekhaja1
  Date: 29-02-2024
  Time: 04:00 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <h1><%= "Enter the Product Details" %></h1>
    <br/>
        <form action="<%=request.getContextPath()%>/addproduct" method="post" modelAttribute="product">
        Product ID: <input type="number" name="prodId" placeholder="Enter the product ID"><br>
        <br>
        Product Name: <input type="text" name="prodName" placeholder="Enter the product name"><br>
        <br>
        Product Type: <input type="text" name="prodDesc" placeholder="Enter the product type"><br>
        <br>
        Price: <input type="number" name="price" placeholder="Enter the product price"><br>
        <br>
        <input type="submit" value="Submit">
        </form>
</body>
</html>

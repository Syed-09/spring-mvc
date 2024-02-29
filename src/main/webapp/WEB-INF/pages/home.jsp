<%@ page import="com.training.springmvc.model.Product" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=utf-8" language="java"%>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Home Page</h1>

<%--&lt;%&ndash;To get the product details from postgres database&ndash;%&gt;--%>
<%--<% List<Product> productList=(List<Product>)request.getAttribute("productList");%>--%>
<%--<%= productList.get(0).getProdName()%>--%>
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
<%--<input type="submit" value="Add a Product">--%>

</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/28/22
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <form action="Products" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name">
        <label for="price">Price:</label>
        <input type="text" name="price" id="price">
        <input type="submit">
    </form>
<c:forEach var="product" items="${products}">
    <div class="products">
        <h2>${product.name}</h2>
        <p>Price: $${product.price}</p>
    </div>
</c:forEach>
</body>
</html>

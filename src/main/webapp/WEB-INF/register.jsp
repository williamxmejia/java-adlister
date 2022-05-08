<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 5/7/22
  Time: 1:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="/register" method="POST">
    <label for="username">Username</label>
    <input type="text" id="username" name="username"><br>
    <label for="email">Email</label>
    <input type="email" id="email" name="email"><br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password"><br>
    <button>Register</button>
</form>

</body>
</html>

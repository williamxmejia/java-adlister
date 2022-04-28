<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/27/22
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pick a color</title>
</head>
<body>
    <form method="post" action="/pickcolor">
        <label for="color">What's your favorite color?</label>
        <input type="text" id="color" name="color">
        <input type="submit" value="Submit Color">
    </form>
</body>
</html>

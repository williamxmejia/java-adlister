<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/29/22
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>
    <form action="/colorpicker" method="post">
        <label for="color">Pick Color:</label><br>
        <input type="text" id="color" name="color"><br>
        <input type="submit" value="submit">
    </form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 5/2/22
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Color Profile</title>
</head>
<body>
    <form action="/color-profile" method="POST">
        <label for="font-color">Font Color</label>
        <input type="color" name="font-color" id="font-color">
        <label for="bg-color">Background Color</label>
        <input type="color" name="bg-color" id="bg-color">
        <input type="submit" value="submit">
    </form>
    <form action="/color-profile" method="POST">
        <input type="hidden" name="forget">
        <button>Forget</button>
    </form>
</body>
</html>

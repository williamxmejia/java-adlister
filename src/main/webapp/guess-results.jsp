<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/28/22
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Guess results</title>
</head>
<body>
    <c:if test="${result}">
        <h2>You guessed correctly!</h2>
    </c:if>
    <c:if test="${!result}">
        <h2>You guessed incorrectly!</h2>
    </c:if>
</body>
</html>

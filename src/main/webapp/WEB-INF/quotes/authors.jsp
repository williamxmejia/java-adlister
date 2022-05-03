<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 5/3/22
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="author" items="${authors}">
        <p>${author.author_name}</p>
    </c:forEach>
</body>
</html>

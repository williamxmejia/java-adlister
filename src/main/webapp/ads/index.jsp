<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 5/1/22
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ad Listings</title>
</head>
<body>
  <h1>Ad Listings</h1>
<c:forEach var="ad" items="${ads}">
    <h2>${ad.getTitle()}</h2>
    <p>Post id: ${ad.getId()}</p>
    <p>User id: ${ad.getUserId()}</p>
    <p>Description: ${ad.getDescription()}</p>
</c:forEach>
</body>
</html>

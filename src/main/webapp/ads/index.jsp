<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 5/1/22
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>View Ads</title>
</head>
<body>
    <h1>Ad Listings</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>${ad.getTitle()}</h2>
            <p>Post Id: ${ad.getId()}</p>
            <p>User Id: ${ad.getUserId()}</p>
            <p>Description: ${ad.getDescription()}</p>
        </div>
    </c:forEach>
</body>
</html>

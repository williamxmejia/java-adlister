<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/26/22
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="model.foods"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
//    List<foods> foodList = new ArrayList<>(Arrays.asList(
//            new foods(1, "Hot Dogs"),
//            new foods(2, "Pizza"),
//            new foods(3, "Nachos")
//    ));
    List<String> foods = new ArrayList<>(Arrays.asList(
            "flax seed",
            "octopus",
            "catfish",
            "berries",
            "raspberries",
            "tomato puree",
            "cabbage",
            "couscous",
            "prawns",
            "lettuce"
    ));
    request.setAttribute("foods", foods);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%List<foods> food1 = (List<foods>) request.getAttribute("foods"); %>
<p><%= foods.get(0)%></p>

<ol>
    <c:forEach var="food" items="${foods}">
            <li>${food}</li>
    </c:forEach>
</ol>

<ul>
    <c:forEach var="food" items="${foods}">
        <c:if test="${food.length() > 8}" >
            <li>${food}</li>
        </c:if>
    </c:forEach>
</ul>

</body>
</html>

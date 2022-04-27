<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/26/22
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
  List<String> foodList = new ArrayList<>(Arrays.asList(
          "Pizza",
          "pineapple",
          "I need more practice",
          "I do not understand how to set up tomcat properly",
          "I need to to practice this more",
          "Macaroni",
          "Kombucha"
  ));
  request.setAttribute("foods", foodList);
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<ol>
  <c:forEach var="food" items="${foods}">
    <li>${food}</li>
  </c:forEach>
</ol>

<ul>
  <c:forEach var="food" items="${foods}">
    <c:if test="${food.length() > 12}">
      <li>${food}</li>
    </c:if>
  </c:forEach>
</ul>

</body>
</html>

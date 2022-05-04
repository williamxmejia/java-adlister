<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Search for an Author</title>
</head>
<body>
<h2>Search the authors database</h2>
<form action="authorSearch" method="get">
  <label for="author_name">Name of Author:</label>
  <input type="text" name="author_name" id="author_name">
  <input type="submit" value="Search">
</form>
<c:forEach var="author" items="${results}">
  <div class="author">
    <p>${author.author_name}</p>
  </div>
</c:forEach>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>Hi there, what's your name?</h1>
    <form method="post" action="Hello">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name">
        <button type="submit">Submit</button>
    </form>

    <p>Hello there, ${name}</p>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Guessing Game</h1>
    <h2>Guess a number between 1 and 3</h2>
    <form action="/guess" method="post">
        <input type="radio" id="one" name="guess" value=1>
        <label for="one">1</label><br>
        <input type="radio" id="two" name="guess" value=2>
        <label for="two">2</label><br>
        <input type="radio" id="three" name="guess" value=3>
        <label for="three">3</label><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>

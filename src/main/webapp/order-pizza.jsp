<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/28/22
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Design Pizza:</h1>
    <form>
        <label for="crust">Choose a crust:</label>
        <select id="crust" name="crust">
            <option value="flat">Flat</option>
            <option value="crispy">Crispy</option>
            <option value="hand-tossed">Hand tossed</option>
        </select>
        <br>
        <label for="sauce">Choose a sauce:</label>
        <select id="sauce" name="sauce">
            <option value="marinara">Marinara</option>
            <option value="bbq">BBQ</option>
            <option value="buffalo">Buffalo</option>
        </select>
        <fieldset>
            <legend>Choose toppings:</legend>
                <input type="checkbox" id="pineapple" value ="pineapple" name="toppings">
                <label for="pineapple">Pineapple</label>
                <input type="checkbox" id="jalapenos" value="jalapenos" name="toppings">
                <label for="jalapenos">Jalapeños</label>
                <input type="checkbox" id="beyond" value="beyond" name="toppings">
                <label for="beyond">Beyond</label>
        </fieldset>
        <input type="submit" value="Submit">
    </form>

    <h1>Your order:</h1>
    <p>Crust: ${crust}</p>
    <p>Sauce: ${sauce}</p>
    <p>Toppings:</p>
    <c:forEach var="topping" items="${toppings}">
        <p>${topping}</p>
    </c:forEach>

</body>
</html>

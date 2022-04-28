<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/28/22
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Pizza</title>
</head>
<body>
    <h1>Make pizza</h1>

    <form action="" method="post">
        <label for="crust">Choose a crust: </label>
        <select id="crust">
            <option value="handtossed">Hand Tossed</option>
            <option value="crispy">Crispy</option>
            <option value="thin">Thin</option>
        </select>
        <br>
        <label for="size">Choose size: </label>
        <select name="" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="Large">Large</option>
        </select>
        <fieldset>
            <input type="checkbox" id="pineapple" name="pineapple" value="toppings">
            <label for="pineapple">Pineapple</label><br>
            <input type="checkbox" id="onions" name="onions" value="toppings">
            <label for="onions">Onions</label><br>
            <input type="checkbox" id="jalapenos" name="jalapenos" value="toppings">
            <label for="jalapenos">Jalapeños</label><br>
        </fieldset>
            <button type="submit">Submit</button>
    </form>
</body>
</html>

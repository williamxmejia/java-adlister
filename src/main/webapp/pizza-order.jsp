<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Build pizza</h1>
  <h2>Choose Crust: </h2>
  <form method="post" action="pizza-order">
      <label for="crust">Choose a crust:</label>
      <select id="crust" name="crust">
          <option value="none"></option>
          <option value="regular">Regular</option>
          <option value="hand-tossed">Hand Tossed</option>
          <option value="crispy">Crispy</option>
          <option value="flat">Flat</option>
      </select>

  <h2>Choose Sauce:</h2>
      <label for="sauce">Choose a size:</label>
      <select id="sauce" name="sauce">
          <option value=none></option>
          <option value="marinara">Marinara</option>
          <option value="bbq">BBQ</option>
          <option value="white">White</option>
          <option value="buffalo">Buffalo</option>
      </select>


  <h2>Choose Size:</h2>
      <label for="size">Choose a size:</label>
      <select id="size" name="size">
          <option value=none></option>
          <option value="small">Small</option>
          <option value="medium">Medium</option>
          <option value="large">Large</option>
          <option value="x-large">Extra Large</option>
      </select>

      <fieldset>
          <legend>Choose your interests</legend>
          <div>
              <input type="checkbox" id="pineapple" name="toppings" value="pineapple">
              <label for="pineapple">Pineapple</label>
          </div>
          <div>
              <input type="checkbox" id="onions" name="toppings" value="onions">
              <label for="onions">Onions</label>
          </div>
          <div>
              <input type="checkbox" id="tomatoes" name="toppings" value="tomatoes">
              <label for="tomatoes">Tomatoes</label>
          </div>
          <div>
              <input type="checkbox" id="jalapenos" name="toppings" value="jalapenos">
              <label for="jalapenos">Jalapeños</label>
          </div>
      </fieldset>
      <input type="submit" value="Submit Order">
  </form>
    <h2>Order details:</h2>
    <p>Crust: ${crust}</p>
    <p>Sauce: ${sauce}</p>
    <p>Size: ${size}</p>
    <p>Toppings:</p>
  <c:forEach var="topping" items="${toppings}">
      <li>${topping}</li>
  </c:forEach>

</body>
</html>

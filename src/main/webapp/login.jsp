<%--
  Created by IntelliJ IDEA.
  User: williammejia
  Date: 4/26/22
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if(request.getMethod().equalsIgnoreCase("post")){
    String firstName = request.getParameter("fname");
    application.setAttribute("fname", firstName);
    String password = request.getParameter("password");
    application.setAttribute("password", password);
    if(firstName.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    }else if(firstName.length() == 0 && password.length() == 0){
        response.sendRedirect("/login.jsp?error");

    }
}%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label for="fname">User:</label>
    <input type="text" id="fname" name="fname"><br><br>
    <label for="password">password:</label>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>

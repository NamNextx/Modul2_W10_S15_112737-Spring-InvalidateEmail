<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-21
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>Email Validate </h1>
    <h3 style="counter:red">${message}</h3>

    <form action="/validate" method="post" >
        <input type="email" name="email"> </br>
        <input type="submit" value="Check">
    </form>
  </body>
</html>

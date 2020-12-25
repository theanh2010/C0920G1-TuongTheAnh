<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/14/2020
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form action="/pay" method="post">
  <label>
    <input type="text" name="description" >
  </label>mo ta san pham;
  <br/>
  <label>
    <input type="text" name="price">
  </label> gia san pham;
  <br/>
  <label>
    <input type="text" name ="discount">
  </label> % san pham;
  <br/>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
  </body>
</html>

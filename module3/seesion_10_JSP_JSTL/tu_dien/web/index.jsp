<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/15/2020
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      input[type=text] {
        width: 300px;
        font-size: 16px;
        border: 2px solid #ccc;
        border-radius: 4px;
        padding: 12px 10px 12px 10px;
      }
      #submit {
        border-radius: 2px;
        padding: 10px 32px;
        font-size: 16px;
      }
    </style>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="dictionary.jsp">
    <label>
      <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    </label>
    <input type = "submit" id = "submit" value = "Search"/>
  </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 1/4/2021
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/create">
    <label>
        <input type="text" name="eng" placeholder="Enter your word: "/>
    </label>
    <input type = "submit" id = "submit" value = "Search"/>

</form>
<p>
    ${vn}
</p>
</body>
</html>

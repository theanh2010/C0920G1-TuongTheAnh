<%@ page import="com.sun.deploy.net.DownloadException" %><% DownloadException exception = null; %><%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/17/2020
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Error</h1>
<h2><%=exception.getMessage() %><br/> </h2>
</body>
</html>

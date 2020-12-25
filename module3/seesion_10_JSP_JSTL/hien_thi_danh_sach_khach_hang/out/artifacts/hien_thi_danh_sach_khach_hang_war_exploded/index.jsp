<%@ page import="java.util.List" %>
<%@ page import="model.Customer" %>
<%@ page import="model.CustomerDAO" %><%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/15/2020
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
  </head>
  <body>
<%
  List<Customer> listCustomer = CustomerDAO.getCustomerList();
  request.setAttribute("listCustomer" , listCustomer);

%>
<h2>Danh sách khách hàng</h2>
<table class="table table-striped" >
  <tr>
    <th>ID</th>
    <th>Họ và Tên</th>
    <th>Ngày Sinh</th>
    <th>Địa Chỉ</th>
    <th>Hình ảnh</th>
    <th>Edit</th>
  </tr>
  <tbody>
  <c:forEach var="customer" items="${listCustomer}">
    <tr>
      <td><c:out value="${customer.id}"/></td>
      <td><c:out value="${customer.name}"/></td>
      <td><c:out value="${customer.birthday}"/></td>
      <td><c:out value="${customer.adress}"/></td>
      <td><img src="<c:out value='${customer.img}'/>" height="180px" width="150px" alt=""></td>
      <td>
        <button class="btn btn-warning">Chỉnh Sửa</button>
        <button class="btn btn-danger">Xóa</button>
      </td>
    </tr>
  </c:forEach>
  </tbody>

</table>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
  </body>
</html>

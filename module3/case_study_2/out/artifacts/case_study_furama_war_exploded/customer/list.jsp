<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/21/2020
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container-fluid mx-0">
    <table class="table table table-striped" style="width: 100%" id="tableCustomer">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Id Card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Customer Type</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="listCustomer" items="${list.get(0)}">
            <tr>
                <th><c:out value="${listCustomer.id}"/></th>
                <td><c:out value="${listCustomer.name}"/></td>
                <td><c:out value="${listCustomer.birthday}"/></td>
                <td><c:out value="${listCustomer.gender}"/></td>
                <td><c:out value="${listCustomer.id_card}"/></td>
                <td><c:out value="${listCustomer.phone}"/></td>
                <td><c:out value="${listCustomer.email}"/></td>
                <td><c:out value="${listCustomer.address}"/></td>
                <c:forEach var="listCustomerType" items="${list.get(1)}">
                    <c:if test="${listCustomer.idCustomerType == listCustomerType.idCustomerType}">
                        <td><c:out value="${listCustomerType.nameCustomerType}"/></td>
                    </c:if>
                </c:forEach>
                <td>
                    <form action="/customer" method="get">
                        <input type="hidden" name="action" value="getCustomer">
                        <input type="hidden" name="id" value="${listCustomer.id}">
                        <button class="btn btn-primary" type="submit">Edit</button>
                    </form>
                    <button id="modalEdit" hidden="hidden" type="button" class="btn btn-primary btn-lg"
                            data-toggle="modal"
                            data-target="#modelEditCustomer"></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

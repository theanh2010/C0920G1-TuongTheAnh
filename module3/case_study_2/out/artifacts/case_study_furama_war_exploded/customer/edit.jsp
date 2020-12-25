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
<div class="modal fade" id="modelEditCustomer" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Edit Customer</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="" method="post">
                <div class="modal-body">
                    <div class="form-group">
                        <label class="col-form-label">Id:</label>
                        <input type="text" class="form-control" name="name" value="${customer.id}" readonly>
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Name:</label>
                        <input type="text" class="form-control" name="name" value="${customer.name}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Birthday:</label>
                        <input type="text" class="form-control" name="name" value="${customer.birthday}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Id Card:</label>
                        <input type="text" class="form-control" name="name" value="${customer.id_card}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Phone:</label>
                        <input type="text" class="form-control" name="name" value="${customer.phone}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Email:</label>
                        <input type="text" class="form-control" name="name" value="${customer.email}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Address:</label>
                        <input type="text" class="form-control" name="name" value="${customer.address}">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Gender:</label>
                        <select name="gender">
                            <c:choose>
                                <c:when test="${customer.gender == 'Nam'}">
                                    <option value="Nam" selected>Nam</option>
                                    <option value="Nu">Nu</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="Nu" selected>Nu</option>
                                    <option value="Nam">Nam</option>
                                </c:otherwise>
                            </c:choose>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Customer Type:</label>
                        <select name="idCustomerType">
                            <c:forEach var="customerType" items="${list.get(1)}">
                                <c:choose>
                                    <c:when test="${customerType.idCustomerType == customer.idCustomerType}">
                                        <option value="${customer.idCustomerType}" selected><c:out
                                                value="${customerType.nameCustomerType}"/></option>
                                    </c:when>
                                    <c:otherwise>
                                        <option value="${customerType.idCustomerType}"><c:out
                                                value="${customerType.nameCustomerType}"/></option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

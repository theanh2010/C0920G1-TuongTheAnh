<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/21/2020
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#modelCreateCustomer">
    Create New
</button>

<!-- Modal -->
<div class="modal fade" id="modelCreateCustomer" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/customer?action=create" method="post">
                <div class="modal-body">
                    <div class="form-group">
                        <label class="col-form-label">Name:</label>
                        <input type="text" class="form-control" id="recipientname" name="name">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Birthday:</label>
                        <input type="date" class="form-control" id="recipientbirthday" name="birthday">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Gender:</label>
                        <select name="gender">
                            <option value="Nu">Nam</option>
                            <option value="Name">Nu</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Id Card:</label>
                        <input type="text" class="form-control" id="recipientidCard" name="idCard">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Phone:</label>
                        <input type="text" class="form-control" id="recipientphone" name="phone">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Email:</label>
                        <input type="text" class="form-control" id="recipientemail" name="email">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Address:</label>
                        <input type="text" class="form-control" id="recipientaddress" name="address">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Customer Type:</label>
                        <select name="idCustomerType">
                            <c:forEach var="customerType" items="${list.get(1)}">
                                <option value="${customerType.idCustomerType}">
                                    <c:out value="${customerType.nameCustomerType}"/>
                                </option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Ok</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>

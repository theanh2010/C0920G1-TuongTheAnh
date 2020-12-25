<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/24/2020
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@    taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assets/bootstrap/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<div class="container-fluid">

    <h1 class="text-center mt-4 mb-5">Contract Detail</h1>
    <div class="row">
        <div class="col-4">
            <a href="/contracts" class="btn btn-danger">Back to Contract</a>
            <a href="/" class="btn btn-warning">Home</a>


        </div>
        <div class="col-8 form-group">
            <form class="row" action="/contract-details" method="get">
                <button style="margin-left: 350px" class="btn btn-primary col-2" name="action" value="search">Search</button>
                <input type="text" name="name" class="form-control col-5">
            </form>
        </div>
    </div>

    <table id="contract_table" class="table table-striped" >
        <thead>
        <tr>
            <th>ID</th>
            <th>Contract ID</th>
            <th>Attach service</th>
            <th>Quantity</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${contractDetailList}" var="contractDetail">
            <tr>
                <td>${contractDetail.id}</td>
                <td>${contractDetail.contractId}</td>
                <td>${contractDetail.attachService}</td>
                <td>${contractDetail.quantity}</td>
                <td><a href="#" class="btn btn-primary">Update</a></td>
                <td> <a href="#" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script>
    $(document).ready(function () {
        $('#contract_table').dataTable({
            "dom" : 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script src="../assets/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="../assets/bootstrap/js/popper.min.js"></script>
<script src="../assets/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="../assets/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../assets/bootstrap/js/bootstrap.min.js"></script>
<script src="../assets/bootstrap/js/bootstrap.bundle.js"></script>
</body>
</html>

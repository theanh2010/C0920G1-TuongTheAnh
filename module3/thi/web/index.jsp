<%--
  Created by IntelliJ IDEA.
  User: Thanh Long
  Date: 12/25/2020
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Title</title>
  <link rel="stylesheet" type="text/css" href="../assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="../assets/bootstrap/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<div class="container-fluid" >
  <h1 class="text-center mt-4 mb-5">List Customer</h1>
  <div class="row">
    <div class="col-4">
      <a href="/" class="btn btn-warning">Home</a>
    </div>

    <div class="form-group col-8">
      <form class="row" action="/benhan" method="get">
        <button style="margin-left: 350px" type="submit" class="btn btn-primary col-2" name="action"
                value="find">Search
        </button>
        <input type="text" class="form-control col-5" placeholder="Name" name="name">
      </form>
    </div>
  </div>
  <table id="customer_table" class="table table-striped">
    <thead>
    <tr>
      <th>Ma benh an</th>
      <th>Ma benh nhan</th>
      <th>ngay nhap vien</th>
      <th>ngay ra vien</th>
      <th>bac si dieu tri</th>
      <th>ly do</th>
      <th>ten benh nhan</th>
      <th>Update</th>
      <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${benhAnList}" var="benhAn">
      <tr>
        <td>${benhAn.id_benh_an}</td>
        <td>${benhAn.id_benh_nhan}</td>
        <td>${benhAn.ngay_nhap_vien}</td>
        <td>${benhAn.ngay_ra_vien}</td>
        <td>${benhAn.bac_si_dieu_tri}</td>
        <td>${benhAn.ly_do}</td>
        <td>${benhAn.ten_benh_nhan}</td>
        <td><a href="#" class="btn btn-warning" data-toggle="modal" data-target="#modalUpdate"
               onclick="onUpdate('${benhAn.id_benh_an}','${benhAn.id_benh_nhan}','${benhAn.ngay_nhap_vien}','${benhAn.ngay_ra_vien}','${benhAn.bac_si_dieu_tri}'
                       ,'${benhAn.ly_do}')">Update</a>
        </td>
        <td><a href="#" class="btn btn-danger" data-toggle="modal" data-target="#modalDelete"
               onclick="onDelete('${benhAn.id_benh_an}')">Delete</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <%--    <ul class="pagination">--%>
  <%--        <c:forEach begin="1" end="${totalPage}" var="i">--%>
  <%--            <li class="page-item"><a id="${i}" class="page-link active" href="customers?page=${i}">${i}</a></li>--%>
  <%--        </c:forEach>--%>
  <%--    </ul>--%>
</div>

<%--UPDATE--%>
<div class="modal fade" id="modalUpdate" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal update</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form action="/benhan" method="post">
          <input type="hidden" name="id_benh_an" id="updateIdBenhAn">
          <input type="hidden" name="id_benh_nhan" id="updateIdBenhNhan">
          <div class="form-group row">
            <label class="col-4">ngay Nhap vien </label>
            <input class="form-control col-8" type="date" name="ngay_nhap_vien" id="ngay_nhap_vien">
          </div>
          <div class="form-group row">
            <label class="col-4"> ngay ra vien</label>
            <input class="form-control col-8" type="date" name="ngay_ra_vien" id="ngay_ra_vien">
          </div>
          <div class="form-group row">
            <label class="col-4">bac si dieu tri </label>
            <input class="form-control col-8" type="text" name="bac_si_dieu_tri" id="bac_si_dieu_tri">
          </div>
          <div class="form-group row">
            <label class="col-4">ly do </label>
            <input class="form-control col-8" type="text" name="ly_do" id="ly_do">
          </div>
          <div class="form-group row">
            <label class="col-4">Ten benh nhan</label>
            <select class="col-8 form-control" name="name_benh_nhan" id="updatebenhNhan">
              <c:forEach var="benhNhan" items="${benhNhanList}" >
                <option value="${benhNhan.id_benh_nhan}" >${benhNhan.ten_benh_nhan}</option>
              </c:forEach>
            </select>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            <button type="submit" class="btn btn-primary" name="action" value="update">Save</button>
          </div>
        </form>
      </div>

    </div>
  </div>
</div>
<%--DELETE--%>
<div class="modal fade" id="modalDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Delete customer</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <h2>Are you sure?</h2>
        <form action="/benhan" method="post">
          <input type="hidden" name="id_benh_an" id="deleteId">
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            <button type="submit" class="btn btn-danger" name="action" value="delete">Delete</button>
          </div>
        </form>
      </div>

    </div>
  </div>
</div>

<script src="../assets/bootstrap/jquery/jquery-3.5.1.min.js"></script>
<script src="../assets/bootstrap/js/popper.min.js"></script>
<script src="../assets/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="../assets/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../assets/bootstrap/js/bootstrap.min.js"></script>
<script src="../assets/bootstrap/js/bootstrap.bundle.js"></script>

<link rel="stylesheet" type="text/css" href="../assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="../assets/bootstrap/datatables/css/dataTables.bootstrap4.min.css">

<script>
  $(document).ready(function () {
    $('#customer_table').dataTable({
      "dom" : 'lrtip',
      "lengthChange": false,
      "pageLength": 5
    });
  });
</script>
</body>
<%--('${benhAn.id_benh_an}','${benhAn.id_benh_nhan}','${benhAn.ngay_nhap_vien}','${benhAn.ngay_ra_vien}','${benhAn.bac_si_dieu_tri}'--%>
<%--,'${benhAn.ly_do}')">Update</a>--%>
<script>
  function onUpdate(updateIdBenhAn, updateIdBenhNhan, ngay_nhap_vien, ngay_ra_vien, bac_si_dieu_tri, li_do, updatebenhNhan) {
    document.getElementById("updateIdBenhAn").value = updateIdBenhAn;
    document.getElementById("updateIdBenhNhan").value = updateIdBenhNhan;
    document.getElementById("ngay_nhap_vien").value = ngay_nhap_vien;
    document.getElementById("ngay_ra_vien").value = ngay_ra_vien;
    document.getElementById("bac_si_dieu_tri").value = bac_si_dieu_tri;
    document.getElementById("li_do").value = li_do;
    switch (updatebenhNhan) {
      case "Chien":
        updatebenhNhan = 1;
        break;
      case "Phuc":
        updatebenhNhan = 2;
        break;
      case "Ngoc Anh":
        updatebenhNhan = 3;
        break;
      case "Thuy Trang":
        updatebenhNhan = 4;
        break;
    }
    document.getElementById("updatebenhNhan").value = updatebenhNhan;
  }

  function onDelete(id) {
    document.getElementById("deleteId").value = id;
  }

</script>
</html>

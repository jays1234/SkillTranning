<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 24/7/2558
  Time: 3:02 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
  <link rel="stylesheet" href="../bootstrap/dist/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="../bootstrap/dist/css/bootstrap-theme.min.css">
</head>
<body>

<div class="container-fluid">
  <div class="row">
    <div class="col-md-12">
      <h1></h1>
      <button type="button" name="clickMe" class="btn btn-primary">
        Click Me
      </button>

    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <br>
      <div class="form-group">
        <label>input : </label>
        <input name = input>
        <button type="button" name="clickIt" class="btn btn-success">
          submit
        </button>
      </div>

    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <h1></h1>
      <button type="button" name="ajax" class="btn btn-primary">
        ajax
      </button>

    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <h1></h1>
      <button type="button" name="ajax" class="btn btn-primary">
        ajax
      </button><br>
      aaa
      <table class="table">
        <thead>
        <tr>
          <td>id</td>
          <td>name</td>
          <td>lastname</td>
        </tr>
        </thead>
        <tbody>

        </tbody>
      </table>

    </div>
  </div>
</div>


<script src="../bootstrap/jquery-1.11.3.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="../bootstrap/dist/js/bootstrap.min.js"></script>
<script src="jquery.js"></script>
</body>
</html>

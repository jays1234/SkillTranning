<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 24/7/2558
  Time: 1:16 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="dist/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="dist/css/bootstrap-theme.min.css">
</head>
<body>


<div class="container-fluid">
  <div class="row">
    <div class="col-md-12">
      <nav class="navbar navbar-default navbar-inverse" role="navigation">
        <div class="navbar-header">

          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
          </button> <a class="navbar-brand" href="#">Brand</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li class="active">
              <a href="#">Link</a>
            </li>
            <li>
              <a href="#">Link</a>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
              <ul class="dropdown-menu">
                <li>
                  <a href="#">Action</a>
                </li>
                <li>
                  <a href="#">Another action</a>
                </li>
                <li>
                  <a href="#">Something else here</a>
                </li>
                <li class="divider">
                </li>
                <li>
                  <a href="#">Separated link</a>
                </li>
                <li class="divider">
                </li>
                <li>
                  <a href="#">One more separated link</a>
                </li>
              </ul>
            </li>
          </ul>
          <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input class="form-control" type="text" />
            </div>
            <button type="submit" class="btn btn-default">
              Submit
            </button>
          </form>
          <ul class="nav navbar-nav navbar-right">
            <li>
              <a href="#">Link</a>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
              <ul class="dropdown-menu">
                <li>
                  <a href="#">Action</a>
                </li>
                <li>
                  <a href="#">Another action</a>
                </li>
                <li>
                  <a href="#">Something else here</a>
                </li>
                <li class="divider">
                </li>
                <li>
                  <a href="#">Separated link</a>
                </li>
              </ul>
            </li>
          </ul>
        </div>

      </nav>
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">
            Panel title
          </h3>
        </div>
        <div class="panel-body">
          Panel content
        </div>
        <div class="panel-footer">
          Panel footer
        </div>
      </div>
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <ul class="pagination">
        <li>
          <a href="#">Prev</a>
        </li>
        <li>
          <a href="#">1</a>
        </li>
        <li>
          <a href="#">2</a>
        </li>
        <li>
          <a href="#">3</a>
        </li>
        <li>
          <a href="#">4</a>
        </li>
        <li>
          <a href="#">5</a>
        </li>
        <li>
          <a href="#">Next</a>
        </li>
      </ul>
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <div class="panel-group" id="panel-598854">
        <div class="panel panel-default">
          <div class="panel-heading">
            <a class="panel-title" data-toggle="collapse" data-parent="#panel-598854" href="#panel-element-290189">Collapsible Group Item #1</a>
          </div>
          <div id="panel-element-290189" class="panel-collapse collapse in">
            <div class="panel-body">
              Anim pariatur cliche...
            </div>
          </div>
        </div>
        <div class="panel panel-default">
          <div class="panel-heading">
            <a class="panel-title" data-toggle="collapse" data-parent="#panel-598854" href="#panel-element-735061">Collapsible Group Item #2</a>
          </div>
          <div id="panel-element-735061" class="panel-collapse collapse">
            <div class="panel-body">
              Anim pariatur cliche...
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <a id="modal-785746" href="#modal-container-785746" role="button" class="btn" data-toggle="modal">Launch demo modal</a>

      <div class="modal fade" id="modal-container-785746" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">

              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                ×
              </button>
              <h4 class="modal-title" id="myModalLabel">
                Modal title
              </h4>
            </div>
            <div class="modal-body">
              ...
            </div>
            <div class="modal-footer">

              <button type="button" class="btn btn-default" data-dismiss="modal">
                Close
              </button>
              <button type="button" class="btn btn-primary">
                Save changes
              </button>
            </div>
          </div>

        </div>

      </div>

    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
      <form role="form">
        <div class="form-group">

          <label for="exampleInputEmail1">
            Email address
          </label>
          <input class="form-control" id="exampleInputEmail1" type="email" />
        </div>
        <div class="form-group">

          <label for="exampleInputPassword1">
            Password
          </label>
          <input class="form-control" id="exampleInputPassword1" type="password" />
        </div>
        <div class="form-group">

          <label for="exampleInputFile">
            File input
          </label>
          <input id="exampleInputFile" type="file" />
          <p class="help-block">
            Example block-level help text here.
          </p>
        </div>
        <div class="checkbox">

          <label>
            <input type="checkbox" /> Check me out
          </label>
        </div>
        <button type="submit" class="btn btn-default">
          Submit
        </button>
      </form>
    </div>
  </div>
</div>
          <script src="jquery-1.11.3.min.js"></script>
          <!-- Latest compiled and minified JavaScript -->
          <script src="dist/js/bootstrap.min.js"></script>
</body>
</html>

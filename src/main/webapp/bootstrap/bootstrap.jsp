<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 23/7/2558
  Time: 17:14 น.
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
  <link rel="stylesheet" href="dist/css/bootstrap-datepicker.css">
</head>
<body>
<div class="container-fluid">

  <!--Text -->
  <div class="row">
    <div class="col-md-6 col-md-offset-3">
      <h2>TextField</h2>
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
          <h3>textarea</h3>
          <textarea class="form-control" rows="4" cols="50"></textarea>
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

        <button type="submit" class="btn btn-default">
          Submit
        </button>
      </form>
    </div>


    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h2>Date Picker</h2>
        <div class="input-group">
          <span class="input-group-addon"><span class="glyphicon glyphicon-heart"></span></span>
          <input  class="form-control" type="text" placeholder="click to show datepicker"  id="example1">
          <span class="input-group-addon">j</span>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h2>Button</h2>
        <!-- Standard button -->
        <button type="button" class="btn btn-default">Default</button>

        <!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
        <button type="button" class="btn btn-primary">Primary</button>

        <!-- Indicates a successful or positive action -->
        <button type="button" class="btn btn-success">Success</button>

        <!-- Contextual button for informational alert messages -->
        <button type="button" class="btn btn-info">Info</button>

        <!-- Indicates caution should be taken with this action -->
        <button type="button" class="btn btn-warning">Warning</button>

        <!-- Indicates a dangerous or potentially negative action -->
        <button type="button" class="btn btn-danger">Danger</button>

        <!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
        <button type="button" class="btn btn-link">Link</button>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h3>
          h3. Lorem ipsum dolor sit amet.
        </h3>
        <h2>Tag p</h2>
        <p>
          Lorem ipsum dolor sit amet, <strong>consectetur adipiscing elit</strong>. Aliquam eget sapien sapien. Curabitur in metus urna. In hac habitasse platea dictumst. Phasellus eu sem sapien, sed vestibulum velit. Nam purus nibh, lacinia non faucibus et, pharetra in dolor. Sed iaculis posuere diam ut cursus. <em>Morbi commodo sodales nisi id sodales. Proin consectetur, nisi id commodo imperdiet, metus nunc consequat lectus, id bibendum diam velit et dui.</em> Proin massa magna, vulputate nec bibendum nec, posuere nec lacus. <small>Aliquam mi erat, aliquam vel luctus eu, pharetra quis elit. Nulla euismod ultrices massa, et feugiat ipsum consequat eu.</small>
        </p>
        <h2>Tag address</h2>
        <address>
          <strong>Twitter, Inc.</strong><br /> 795 Folsom Ave, Suite 600<br /> San Francisco, CA 94107<br /> <abbr title="Phone">P:</abbr> (123) 456-7890
        </address>
        <h2>Tag blockquote</h2>
        <blockquote>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
          </p> <small>Someone famous <cite>Source Title</cite></small>
        </blockquote>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <div class="input-group">
          <div class="radio">

            <label class="radio-inline"><input  type="radio" name="radio" value="a">a</label>
              <label class="radio-inline"><input  type="radio" name="radio" value="b">b</label>
                <label class="radio-inline"><input  type="radio" name="radio" value="c">c</label>
          </div>

        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <div class="dropdown">
          <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Tutorials
            <span class="caret"></span></button>
          <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">HTML</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">CSS</a></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">JavaScript</a></li>
            <li role="presentation" class="divider"></li>
            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">About Us</a></li>
          </ul>
        </div>
        <div class="form-group">
          <label for="sel1">Select list:</label>
          <select class="form-control" id="sel1">
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
          </select>
        </div>
        </div>
    </div>

    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h2>table</h2>
        <table class="table">
          <thead>
          <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>John</td>
            <td>Doe</td>
            <td>john@example.com</td>
          </tr>
          <tr>
            <td>Mary</td>
            <td>Moe</td>
            <td>mary@example.com</td>
          </tr>
          <tr>
            <td>July</td>
            <td>Dooley</td>
            <td>july@example.com</td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
</div>
</div>




<script src="jquery-1.11.3.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="dist/js/bootstrap.min.js"></script>
  <script src="dist/js/bootstrap-datepicker.js"></script>

  <script type="text/javascript">
    // When the document is ready
    $(document).ready(function () {

      $('#example1').datepicker({
        format: "dd/MM/yyyy"
      });

    });
  </script>
</body>
</html>

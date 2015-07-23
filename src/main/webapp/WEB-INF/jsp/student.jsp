<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 23/7/2558
  Time: 14:12 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1">
  <thead>
    <tr>
      <td>ID</td>
      <td>firstName</td>
      <td>lastName</td>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="student" items="${studentList}">
    <tr>
      <td>${student.studentId}</td>
      <td>${student.firstName}</td>
      <td>${student.lastName}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 23/7/2558
  Time: 14:12 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title></title>
</head>
<body>
<c:set var="MS001"><spring:message code = "MS001"></spring:message></c:set>
<c:set var="MS002"><spring:message code = "MS002"></spring:message></c:set>
<c:set var="MS003"><spring:message code = "MS003"></spring:message></c:set>
<c:set var="MS004"><spring:message code = "MS004"></spring:message></c:set>
<table border="1">
  <thead>
    <tr>
      <td>${MS001}</td>
      <td>${MS002}</td>
      <td>${MS003}</td>
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

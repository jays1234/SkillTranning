<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 23/7/2558
  Time: 1:56 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:catch var="sqlException">
<sql:setDataSource var="dataSource" driver="oracle.jdbc.driver.OracleDriver"
                   url="jdbc:oracle:thin:@localhost:1521:xe"
                   user="phirayu"  password="123456" scope="session"/>

<sql:query dataSource="${dataSource}" var="result">
    SELECT * from Student
</sql:query>
</c:catch>

Exception is ${sqlException}<br>
Message is ${sqlException.message}<br>


<table border="1">
    <thead>
    <tr>
        <td>id</td>
        <td>firstname</td>
        <td>lastname</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${result.rows}">
        <tr>
            <td>${student.STUDENT_ID}</td>
            <td>${student.FIRST_NAME}</td>
            <td>${student.LAST_NAME}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<h2>if</h2>
<c:if test="${true}">
     if true
</c:if>
<br>
<h2>Set</h2>
<c:set var="salary" scope="session" value="${2000*2}"/>
${salary}
<br><h2>Out</h2>

<c:out value="${salary}"></c:out>
<h2>Choose</h2>
<c:choose>
    <c:when test="${salary >4000}">aaa</c:when>
    <c:when test="${salary eq 4000}">bbb</c:when>
</c:choose>
</body>
</html>

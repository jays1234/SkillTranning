<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 22/7/2558
  Time: 17:07 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
${status}<br>
${sessionScope.status}<br>
<%= request.getSession().getAttribute("status") %><br>
<!--jstl-->
<c:out value="${sessionScope.status}"></c:out><br>
<c:out value="${status}"></c:out>
<h2>Cookie</h2>
${cookie['status']}
</body>
</html>

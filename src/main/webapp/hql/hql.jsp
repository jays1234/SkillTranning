<%--
  Created by IntelliJ IDEA.
  User: phirayu
  Date: 24/7/2558
  Time: 11:30 น.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>SQL</h2>
<p>select *
from (select max(item), max(item) from Table1)
union
(select max(item), max(item1) from Table2)</p>
<h2>HQL</h2>
<p>from (select max(t1.item), max(t2.item1) from POJOClass t1)union
  (select max(t2.item), max(t2.item1) from POJOClass t2)</p>
</body>
</html>

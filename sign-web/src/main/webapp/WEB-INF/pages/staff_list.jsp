<%--
  Created by IntelliJ IDEA.
  User: a20171105115
  Date: 2020-04-04
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>同学列表</title>
</head>
<body>
<table>
    <tr>
        <td>昵称</td>
        <td>身份</td>
        <td>性别</td>
        <td>班级</td>
    </tr>
    <c:forEach var="staff" items="${list}">
    <tr>
        <td>${staff.name}</td>
        <td>${staff.post}</td>
        <td>${staff.sex}</td>
        <td>${staff.grade.gradeName}</td>
    </tr>
    </c:forEach>
</table>
<p><a href="/Staff/self?staffId=${user.staffId}">个人信息</a></p>
</body>
</html>

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
    <title>班级列表</title>
</head>
<body>
<table>
    <tr>
        <td>班级名称</td>
        <td>创建时间</td>
    </tr>
    <c:forEach var="grade" items="${list}">
    <tr>
        <td>${grade.gradeName}</td>
<%--        <td>${grade.createTime}</td>--%>
        <td><spring:eval expression="grade.createTime"/></td>
        <td><a href="/Grade/to_update?id=${grade.gradeId}">修改</a></td>
        <td><a href="/Grade/remove?id=${grade.gradeId}">删除</a></td>
    </tr>
    </c:forEach>
    <p><a href="/Grade/to_add">添加班级</a></p>
    <p><a href="/Staff/self?staffId=${user.staffId}">个人信息</a></p>
</table>
</body>
</html>

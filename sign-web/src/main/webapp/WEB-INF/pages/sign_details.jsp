<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>签到详情</title>
</head>
<body>
<table>
    <tr>
        <td>签到人</td>
        <td>签到状态</td>
        <td>签到时间</td>
    </tr>
    <c:forEach var="list" items="${List}">
        <c:if test="${list.signor.post=='学生'}">
        <tr>
            <td>${list.signor.name}</td>
            <td>${list.status}</td>
            <td><spring:eval expression="list.signInTime"/></td>
        </tr>
        </c:if>
    </c:forEach>
</table>
<p><a href="/Staff/self?staffId=${user.staffId}">个人信息</a></p>
</body>
</html>

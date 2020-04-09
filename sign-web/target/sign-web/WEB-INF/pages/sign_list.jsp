<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>已发布签到</title>
</head>
<body>
<table>
    <tr>
        <td>发起人</td>
        <td>发起时间</td>
        <td>发起班级</td>
        <td>操作</td>
    </tr>
    <c:forEach var="list" items="${List}">
        <tr>
            <td>${user.name}</td>
            <td><spring:eval expression="list.createTime"/></td>
            <td>${user.grade.gradeName}</td>
            <td><a href="/Sign/sign_details?signId=${list.signId}">查看签到情况</a></td>
        </tr>
    </c:forEach>
</table>
<p><a href="/Staff/self?staffId=${user.staffId}">个人中心</a></p>
</body>
</html>

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
    <title>个人信息</title>
</head>
<body>
<h2>欢迎您:${sessionScope.user.name}</h2>
<table>
    <tr>
        <td>用户名</td>
        <td>身份</td>
        <td>性别</td>
        <td>班级</td>
    </tr>
    <tr>
        <td>${self.name}</td>
        <td>${self.post}</td>
        <td>${self.sex}</td>
        <td>${self.grade.gradeName}</td>
        <td><a href="/Staff/to_update?staffId=${self.staffId}">修改个人信息</a></td>
    </tr>
</table>
<p><a href="/Staff/to_check?staffId=${self.staffId}">修改密码</a></p>
<p><a href="/Staff/staff_list?gradeId=${self.gradeId}">同学列表</a></p>
<p><a href="/Staff/remove">注销登录</a></p>
<c:if test="${user.post=='老师'}">
    <p><a href="/Grade/list">班级调整</a></p>
    <p><a href="/Staff/to_add">添加同学</a></p>
    <p><a href="/Sign/to_add_sign">发布签到</a></p>
    <p><a href="/Sign/sign_list">签到管理</a></p>
</c:if>
<c:if test="${user.post=='学生'}">
    <p><a href="/Sign/to_sign?signInId=${user.staffId}">待处理签到</a></p>
</c:if>
</body>
</html>

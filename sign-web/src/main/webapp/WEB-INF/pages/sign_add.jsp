<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>发布签到</title>
</head>
<body>
<form action="/Sign/add_sign" method="post">
    <table>
        <tr>
            <td>创建者</td>
            <td>创建班级</td>
            <td>操作</td>
        </tr>
        <tr>
            <input type="hidden" name="createId" value="${user.staffId}">
            <input type="hidden" name="gradeId" value="${user.gradeId}">
            <td>${user.name}</td>
            <td>${user.grade.gradeName}</td>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
    <p><a href="/Staff/self?staffId=${user.staffId}">个人信息</a></p>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: a20171105115
  Date: 2020-04-04
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/Staff/add" method="post">
        <p>昵称<input type="text" name="name"></p>
        <p>账号<input type="text" name="username"></p>
        <p>密码<input type="text" name="password"></p>
        <p>身份
            <select name="post">
                <option value="老师">老师</option>
                <option value="学生">学生</option>
            </select>
        </p>
        <p>性别
            <select name="sex">
                <option value="男">男</option>
                <option value="女">女</option>
            </select>
        </p>
        <p>班级
            <select name="gradeId">
                <c:forEach var="grade" items="${gradeList}">
                <option value="${grade.gradeId}">${grade.gradeName}</option>
                </c:forEach>
            </select>
        </p>
        <p><input type="submit" value="提交"></p>
    </form>
</body>
</html>

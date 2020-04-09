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
    <title>修改个人信息</title>
</head>
<body>
<form action="/Staff/update" method="post">
    <input type="hidden" name="staffId" value="${staff.staffId}">
    <input type="hidden" name="username" value="${staff.username}">
    <input type="hidden" name="password" value="${staff.password}">
    <p>昵称<input type="text" name="name" placeholder="${staff.name}"></p>
    <%--        <td>${grade.createTime}</td>--%>
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
    <input type="submit" value="提交">
</form>

</body>
</html>

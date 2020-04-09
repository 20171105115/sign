<%--
  Created by IntelliJ IDEA.
  User: a20171105115
  Date: 2020-04-04
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/Grade/update" method="post">
        <input type="hidden" name="gradeId" value="${grade.gradeId}">
        <p><input type="text" name="gradeName" placeholder="${grade.gradeName}"></p>
        <p><input type="submit" value="提交"></p>
    </form>
</body>
</html>

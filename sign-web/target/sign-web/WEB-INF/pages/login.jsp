<%--
  Created by IntelliJ IDEA.
  User: a20171105115
  Date: 2020-04-07
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录</h2>
<form action="/Staff/login" method="post">
    <p><input type="text" name="username"></p>
    <p><input type="password" name="password"></p>
    <p>
        <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">
    </p>
</form>
</body>
</html>

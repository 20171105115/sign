<%--
  Created by IntelliJ IDEA.
  User: a20171105115
  Date: 2020-04-07
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
<h2>修改密码</h2>
    <form action="/Staff/checkPwd" method="post">
        <input type="hidden" name="staffId" value="${staffId}">
        <p><input type="text" placeholder="旧密码" name="oldPwd"></p>
        <p><input type="password" placeholder="新密码" name="newPwd1"></p>
        <p><input type="password" placeholder="重新输入新密码" name="newPwd2"></p>
        <input type="submit" value="提交">
    </form>
</body>
</html>

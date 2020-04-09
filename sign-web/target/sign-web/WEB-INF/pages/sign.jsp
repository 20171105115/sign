<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>签到页面</title>
</head>
<body>
<form action="/Sign/sign" method="post">
    <table>
        <tr>
            <td>签到ID</td>
            <td>签到状态</td>
            <td>签到人</td>
            <td>操作</td>
        </tr>
            <c:forEach items="${Self}" var="self">
                <c:if test="${self.status=='待签到'}">
                    <tr>
                        <td><input type="hidden" name="signItemId" value="${self.signItemId}">${self.signId}</td>
                        <td><input type="hidden" name="signId" value="${self.signId}">${self.status}</td>
                        <td><input type="hidden" name="signInId" value="${self.signInId}">${self.signor.name}</td>
                        <td><input type="submit" value="签到"></td>
                    </tr>
                </c:if>
            </c:forEach>
    </table>
</form>
<p><a href="/Staff/self?staffId=${user.staffId}">个人信息</a></p>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>论坛首页</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<c:choose>
    <c:when test="user=null">
        <p>不要随意改地址栏，请<a href="/user/loginPage">访问</a> </p>
    </c:when>
</c:choose>
<div id="BigDiv">
    <div id="userDiv">
        ${user.headImg}&nbsp;&nbsp;
        用户名:<a href="/user/doMyInfo"> ${user.userName}</a>&nbsp;&nbsp;
        <a href="/user/loginPage">退出</a>
    </div>
</div>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的资料</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<c:choose>
    <c:when test="user eq null">
        <p>不要随意修改地址栏，请<a href="/user/loginPage">访问</a></p>
    </c:when>
</c:choose>
<div id="BigDiv" align="center">
    <div id="userDiv">
        ${user.userName}&nbsp;&nbsp;<a href="/myGarden/toMyGardenPage">我的论坛</a> &nbsp;&nbsp;<a href="/user/loginPage">退出</a>
    </div>
    <table id="tb2" align="center">
        <caption>我的资料</caption>
        <tr>
            <td colspan="2">${user.headImg}</td>
        </tr>
        <tr>
            <td>用&nbsp;户名：</td>
            <td>${user.userName}</td>
        </tr>
        <tr>
            <td>性&nbsp;&nbsp;&nbsp;别：</td>
            <td>${user.sex}</td>
        </tr>
        <tr>
            <td>邮&nbsp;&nbsp;&nbsp;箱：</td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>出生年月：</td>
            <td>${user.birthday}</td>
        </tr>
        <tr>
            <td colspan="2">
                <a href="/user/toModifyMyInfoPage">
                    修改资料
                </a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>


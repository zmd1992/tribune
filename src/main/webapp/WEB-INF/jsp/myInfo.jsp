<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>我的资料</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="BigDiv">
    <div id="userDiv">
        ${user.userName}&nbsp;&nbsp;<a href="/user/loginPage">退出</a>
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
    </table>
    <a href="/user/toModifyMyInfoPage">
        修改资料
    </a>

</div>
</body>
</html>


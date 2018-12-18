<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>论坛首页</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="BigDiv">
    <div id="userDiv">
        ${user.headImg}&nbsp;&nbsp;
        用户名:<a href="/user/doMyInfo"> ${user.userName}</a>&nbsp;&nbsp;
        <a href="/user/loginPage">退出</a>
    </div>
</div>
</body>
</html>

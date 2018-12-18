<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<form action="/user/login" method="post">
    <table id="tb"  align="center" >
        <tr >
            <th>用户名：</th>
            <th><input type="text" name="username"></th>
        </tr>
        <tr>
            <th>密&nbsp;&nbsp;码：</th>
            <th><input type="password" name="password"></th>
        </tr>
        <tr>
            <th colspan="2"><input type="submit" value="登录"> &nbsp;&nbsp;<a href="/user/registerPage">注册</a></th>
            <th></th>
        </tr>
    </table>
</form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form action="/user/registerUser" method="post">
    <table border="0" align="center">
        <tr>
            <th>用户头像:</th>
            <th><input type="file" name="headImg"/> </th>
        </tr>
        <tr>
            <th>用&nbsp;户&nbsp;名：</th>
            <th><input type="text" name="username"></th>
        </tr>
        <tr>
            <th>密&nbsp;&nbsp;&nbsp;&nbsp;码：</th>
            <th><input type="password" name="password"></th>
        </tr>
        <tr>
        <th>性&nbsp;&nbsp;&nbsp;&nbsp;别：</th>
        <th><input type="radio" name="sex" value="男" checked="checked">男&nbsp;
            <input type="radio" name="sex" value="女">女
        </th>
        </tr>
        <tr>
        <th>出生年月:</th>
        <th><input type="date" name="birthday"></th>
        </tr>
        <tr>
        <th>Email:</th>
        <th><input type="text" name="email"></th>
        </tr>
        <tr>
            <th colspan="2">
                <input type="submit" value="注册">&nbsp;&nbsp;
                <input type="reset" value="重置">
            </th>
        </tr>
        <tr align="right">
            <th colspan="2">
                <a href="/user/loginPage">已有账户，返回登录</a>
            </th>
        </tr>
    </table>

</form>
</body>
</html>

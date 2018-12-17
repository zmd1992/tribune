
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/17
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/insert" method="post">
    用户名：<input type="text" name="username"/><br/>
    密&nbsp;码：<input type="password" name="password"/><br/>
    公&nbsp;司:<input type="text" name="company"><br/>
    年&nbsp;龄:<input type="text" name="age" id=""/><br/>
    性&nbsp;别:<input type="radio" name="sex" checked="checked" value="0">男&nbsp;
    <input type="radio" name="sex" value="1">女<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>

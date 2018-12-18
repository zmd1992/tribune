<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改资料</title>
</head>
<body>
<div id="userDiv">
    <a href="myInfo.jsp">返回</a>
</div>
<form action="/user/doModifyUser" method="post">
    <table id="tb">
        <tr>
            <td> 头像：</td>
            <td><input type="file" name="headImg"/></td>
        </tr>
        <tr>
            <td>
                邮箱：
            </td>
            <td>
                <input type="text" name="email"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="修改">&nbsp;&nbsp;
                <input type="reset" value="重置">
            </td>
        </tr>

    </table>
</form>

</body>
</html>

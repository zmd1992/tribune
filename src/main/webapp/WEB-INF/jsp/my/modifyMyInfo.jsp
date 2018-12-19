<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改资料</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="userDiv">
    <a href="/user/myInfoPage">返回</a>
</div>
<c:choose>
    <c:when test="user eq null">
        <p>请不要修改该地址，请<a href="/user/loginPage">访问</a></p>
    </c:when>
</c:choose>
<div align="center" id="BigDiv">
    <form action="/user/doModifyUser" method="post">
        <table id="tb">
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
</div>

</body>
</html>

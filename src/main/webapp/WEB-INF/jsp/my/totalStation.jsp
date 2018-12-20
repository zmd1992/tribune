<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>全站</title>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<table id="tbStation">
    <c:forEach var="contentList" items="${gardenList}">
        <c:forEach var="userList" items="${userList}">
            <tr>
                <td align="right">
                        ${userList.userName}:
                </td>
                <td align="left">
                        ${contentList.content}
                    <a href="/myGarden/removeMyGardenContent?id=${contentList.id}">${contentList.id}删除</a>
                </td align=left>
                <td align="left">
                        ${createdAtStr}
                </td>
                <td align="center">
                    <a href="">回应</a>
                </td>
            </tr>
        </c:forEach>
    </c:forEach>
</table>
</body>
</html>

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
                <td id="tdStation">
                        ${userList.userName}:
                </td>
                <td id="tdStation2">${contentList.content}
                    <img src="/image/button/delete.jpg" href="" id="img"></td>
                <td id="tdStation3">
                        ${contentList.createdAt}
                </td>
                <td id="tdStation4">
                    <a>回应</a>
                </td>
            </tr>
        </c:forEach>
    </c:forEach>
</table>
</body>
</html>

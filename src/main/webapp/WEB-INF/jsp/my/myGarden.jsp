<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>我的园子</title>
    <link rel="stylesheet" href="/css/style.css"/>
    <script type="text/javascript">
        window.onload = function (ev) {
            var oInput = document.getElementsByTagName("a");
            var oIframe = document.getElementById("frame");

            function changeHeight() {
                setTimeout(function () {
                    oIframe.height = oIframe.contentWindow.document.body.offsetHeight;
                }, 500);
            }

            function changeWidth() {
                setTimeout(function () {
                    oIframe.width = oIframe.contentWindow.document.body.offsetWidth;
                }, 500);
            }

            changeWidth();
            changeHeight();
            oInput[0].onclick = function () {
                oIframe.src = "/user/loginPage";
                changeHeight()
                changeWidth()
            }
            oInput[1].onclick = function () {
                oIframe.src = "/myGarden/doTotalStation";
                changeHeight();
                changeWidth();
            }
        }
    </script>
</head>
<body>
<div id="BigDiv" align="center">
    <form action="/myGarden/pushContent" method="POST">
        ${user.userName}<br/>
        <textarea id="textarea" cols="25" rows="6" name="content"></textarea>
        <br/>
        <input type="submit" value="发布"/>
    </form>
    <br/>
    <a>登录</a>&nbsp;&nbsp;<a>全站</a><br/>
    <iframe id="frame" src="/myGarden/doTotalStation" scrolling="no"></iframe>
</div>
</body>
</html>

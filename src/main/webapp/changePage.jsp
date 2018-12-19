<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面切换</title>
    <script type="text/javascript">
        window.onload=function (ev) {
            // var oInput=document.getElementsByTagName("input");
            var oInput=document.getElementsByTagName("div");
            var oIframe=document.getElementById("frame");
            function changeHeight(){
                setTimeout(function () {
                    oIframe.height=oIframe.contentWindow.document.body.offsetHeight;
                },100);
            }
            changeHeight();
            oInput[0].onclick=function () {
                oIframe.src = "/user/loginPage";
                changeHeight()
            }
            oInput[1].onclick=function () {
                oIframe.src="/user/registerPage";
                changeHeight();
            }
        }
    </script>
</head>
<body>
<%--<input type="button" value="页面1"/>--%>
<%--<input type="button" value="页面2"/>--%>
<div>页面1</div>
<div>页面2</div>
<iframe id="frame" src="/user/loginPage" scrolling="no"></iframe>
</body>
</html>

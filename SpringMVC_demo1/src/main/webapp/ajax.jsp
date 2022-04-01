<%--
  Created by IntelliJ IDEA.
  User: 汇
  Date: 2022/3/8
  Time: 上午 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax异步提交<</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
<button id="btn1">Ajax异步交互</button>
<script>
    $("#btn1").click(function () {
        let url = '${pageContext.request.contextPath}/ajaxRequest';
        let data = '[{"id":1,"username":"张三"},{"id":2,"username":"李四"}]';
        $.ajax({
            type: 'POST',
            url: url,
            data: data,
            contentType: 'application/json;charset=utf-8',
            success: function (resp) {
                alert(JSON.stringify(resp))
            }
        })
    })
</script>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 汇
  Date: 2022/3/8
  Time: 下午 1:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>单文件上传</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/fileupload" method="post" enctype="multipart/form-data">
        名称：<input type="text" name="username"><br>
        文件：<input type="file" name="filePic"><br>
        <input type="submit" value="单文件上传">
    </form>

    <form action="${pageContext.request.contextPath}/fileupload2" method="post" enctype="multipart/form-data">
        名称：<input type="text" name="username"><br>
        文件1：<input type="file" name="filePic"><br>
        文件2：<input type="file" name="filePic"><br>
        <input type="submit" value="单文件上传">
    </form>
</body>
</html>

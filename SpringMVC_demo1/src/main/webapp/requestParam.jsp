<%--
  Created by IntelliJ IDEA.
  User: 汇
  Date: 2022/2/15
  Time: 上午 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${pageContext.request.contextPath}动态的来获取当前的项目路径 SpringMVC_demo1  a标签的请求方式：get请求--%>
    <a href="${pageContext.request.contextPath}/simplePanram?id=1&username=杰克">
        基本类型
    </a>

    <%--form表单 提交方式为post--%>
    <form action="${pageContext.request.contextPath}/pojoParam" method="post">
        编号：<input type="text" name="id" > <br>
        用户名：<input type="text" name="username">
        <input type="submit" value="对象类型参数">
    </form>

    <%--获取数组类型请求参数--%>
    <form action="${pageContext.request.contextPath}/arrayParam" method="post">
        编号：<input type="checkbox" name="ids" value="1" >1<br>
        <input type="checkbox" name="ids" value="2" >2<br>
        <input type="checkbox" name="ids" value="3" >3<br>
        <input type="checkbox" name="ids" value="4" >4<br>

        <input type="submit" value="数组类型参数">
    </form>


    <%--获取集合（复杂）类型请求参数--%>
    <form action="${pageContext.request.contextPath}/queryParam" method="post">
        <%--placeholder：提醒 --%>
        搜索关键字：
            <input type="text" name="keyword" placeholder="编号"><br>
        user对象：
            <input type="text" name="user.id" placeholder="编号"/>
            <input type="text" name="user.username" placeholder="姓名"> <br>
        list集合 <br>
            第一个元素：
            <input type="text" name="userList[0].id" placeholder="编号">
            <input type="text" name="userList[0].username" placeholder="姓名"> <br>
            第一个元素：
            <input type="text" name="userList[1].id" placeholder="编号">
            <input type="text" name="userList[1].username" placeholder="姓名"> <br>
        map集合<br>
            第一个元素：
            <input type="text" name="userMap[u1].id" placeholder="编号">
            <input type="text" name="userMap[u1].username" placeholder="姓名"/><br>
            第二个元素：
            <input type="text" name="userMap[u2].id" placeholder="编号">
            <input type="text" name="userMap[u2].username" placeholder="姓名"/><br>

            <input type="submit" value="集合(复杂)类型参数">
    </form>

    <%--自定义转换器，：错误产生 2012/12/12--%>
    <form action="${pageContext.request.contextPath}/converterParam" method="post">
        生日：<input type="text" name="birthday">
        <input type="submit" value="自定义转换器">
    </form>

   <a href="${pageContext.request.contextPath}/findByPage?pageNo=2">
        分页查询
   </a>

</body>
</html>

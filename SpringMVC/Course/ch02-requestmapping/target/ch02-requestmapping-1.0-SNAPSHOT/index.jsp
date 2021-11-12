<%--
  Created by IntelliJ IDEA.
  User: 快快乐乐的大海
  Date: 2021/10/13
  Time: 18:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数传递学习</title>
</head>
<body>

    <p>第一个springMVC项目</p>
    <p><a href="user/first.do"> 发起some.do的请求</a> </p>
    <br/>
    <form action="user/first.do" method="post">
       <input type="submit" value="post请求other.do">
    </form>

</body>
</html>

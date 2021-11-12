<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>地址类型实验学习</title>
   <%-- <base href="http://localhost:8080/ch06_path/" />--%>
    <base href="<%=basePath%>" />
</head>
<body>

    <p>第一个springMVC项目</p>
    <p><a href="user/some.do"> 发起user/some.do的请求</a> </p>
    <br/>

</body>
</html>

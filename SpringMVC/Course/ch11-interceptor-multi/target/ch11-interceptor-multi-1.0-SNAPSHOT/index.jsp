<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>拦截器实验首页</title>
    <base href="<%=basePath%>" />
</head>
<body>

    <p>来学习拦截器啦</p>
    <form action="some.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交请求">
    </form>

</body>
</html>

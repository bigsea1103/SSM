<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>提供用户操作的功能入口</title>
    <base href="<%=basePath%>" />
</head>
<body>
   <div align="center">
       <p>SSM整合的例子</p>
       <img src="images/ssm.jpg" />
       <table>
           <tr>
               <td><a href="addStudent.jsp">注册学生</a></td>
           </tr>
           <tr>
               <td><a href="listStudent.jsp">浏览学生</a> </td>
           </tr>
       </table>
   </div>

</body>
</html>

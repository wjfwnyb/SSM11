<%--
  Created by IntelliJ IDEA.
  User: 王佳锋
  Date: 2019/9/13
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%String path=request.getContextPath()+"/";%>
    <title>登录</title>
</head>
<body>
<form method="post" action="<%=path%>login.action">
用户名：<input type="text" name="uname"/>
密码：<input type="text" name="upwd"/>
    爱好：<input type="checkbox" value="篮球" name="habbies"/>篮球
    <input type="checkbox" value="足球" name="habbies"/>足球
    <input type="checkbox" value="羽毛球" name="habbies"/>羽毛球


<input type="submit" value="登录">
</form>
</body>
</html>

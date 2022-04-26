<%--
  Created by IntelliJ IDEA.
  User: jay
  Date: 2022/4/26
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="/index/login_do">
        UserName: <input type="text" name="userName"/>
        PassWord: <input type="password" name="password">
        <input type="submit">
    </form>
</body>
</html>

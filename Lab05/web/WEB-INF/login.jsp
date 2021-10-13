<%-- 
    Document   : login
    Created on : 12-Oct-2021, 8:34:25 AM
    Author     : tweet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <form action="login" method="post">
        <label>User name : </label>
        <input type="text" name="username"><br><br>
        <label>Password  : </label>
        <input type="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
        <p>${message}</p>
    </body>
</html>

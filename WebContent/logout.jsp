<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
<h2><%= request.getAttribute("logout") %></h2>
<form action="ExampleServlet" method = "POST">
<input type="submit" value = "login" name = "cmd"/>
</form>
</body>
</html>
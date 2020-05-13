<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= request.getAttribute("login") %></title>
</head>
<body>
<h2><%= request.getAttribute("login") %></h2>
<form action="ExampleServlet" method = "POST">
<input type="submit" value = "logout" name = "cmd"/>
</form>
</body>
</html>
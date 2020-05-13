<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h2><%= request.getAttribute("member_reg") %></h2>
<form action="member_regprocess.jsp" method = "post">
이름: <input type = "text" name= "name"/>
<input type = "submit" value = "제출"/>
</form>
</body>
</html>
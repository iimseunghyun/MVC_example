<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- parameter 인코딩 필요 , servlet페이지 내에서-->
	<form action="ExampleServlet" method = "POST" > 
	<!-- method= "POST" 일때 action서블릿의 doPost로 연결-->
	이동: <input size= "60" type="text" name = "cmd" placeholder="회원가입=reg, 로그인=login, 정보변경=mod"/><br />
	</form>
</body>
</html>
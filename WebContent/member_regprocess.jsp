<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
    
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String url = "jdbc:mariadb://localhost:3306/mvcsample";
	String user = "root";
	String pw = "gustmddla426";
	Connection con = null;
	Statement stmt = null;
	int res = 0;
	String query = "INSERT INTO member VALUE(null,'"+name+"')";
	try{
		Class.forName("org.mariadb.jdbc.Driver").newInstance();
		con = DriverManager.getConnection(url,user,pw);
		stmt = con.createStatement();
		res = stmt.executeUpdate(query);
	}catch(Exception e){
		out.print(e);
	}finally{
		if (con!=null)
			try{
				con.close();
			}catch(Exception e){
				out.print(e);
			}
		if (stmt != null)
			try{
				stmt.close();
			}catch(Exception e){
				out.print(e);
			}
		response.sendRedirect("member_reg.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
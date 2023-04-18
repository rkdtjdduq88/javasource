<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
%>
<%="아이디 " + userid%><br><%="비밀번호 " + password%>
 --%>
<h4>아이디 : <%=request.getParameter("userid") %></h4>
<h4>비밀번호 : <%=request.getParameter("password") %></h4>
</body>
</html>
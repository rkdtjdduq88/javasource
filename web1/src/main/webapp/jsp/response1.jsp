<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		내장 객체
		
		 1) HttpServletRequest request; (요청 처리)
		 2) HttpServletResponse response; (응답 처리)
		 	sendRedirect("이동할 페이지명") : 페이지 이동
		 	
		 	http://localhost:8080/jsp/response1.jsp 요청 =>
		 	
		 		http://localhost:8080/jsp/response2.jsp 응답
		 		
		 	태그코드를 response1.jsp 안에 앞에쓰던 뒤에쓰던 response2.jsp로 이동하기 때문에 안보임
	--%>
	<h1>response1</h1> 
	<%
		response.sendRedirect("response2.jsp");	
	%>
	<h1>response1</h1>
</body>
</html>
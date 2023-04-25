<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	
	UserDAO dao = new UserDAO();
	UserDTO dto = dao.getRow(no);
	
	request.setAttribute("dto", dto); // "dto"라는 이름으로 dto라는 변수에 담아 놓을게
	pageContext.forward("get.jsp"); // 어디랑 공유할거니? 나는 이 데이터를 get.jsp 페이지와 공유할거야

%>
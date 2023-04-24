<%@page import="book.domain.BookDTO"%>
<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int code = Integer.parseInt(request.getParameter("code"));	

	BookDAO dao = new BookDAO();
	BookDTO dto = dao.getrow(code);
	
	request.setAttribute("dto", dto);
	pageContext.forward("read.jsp");


%>
<%@page import="book.domain.BookDTO"%>
<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	// update.jsp 가져오기
	int code = Integer.parseInt(request.getParameter("code"));
	int price = Integer.parseInt(request.getParameter("price"));
	
	
	// db 작업
	BookDAO dao = new BookDAO();	
	
	// 페이지 이동 - 성공시 목록으로	
	if(dao.update(price, code)){
		response.sendRedirect("listPro.jsp");
	}else{
		response.sendRedirect("modifyPro.jsp?code="+code);
	}
	
%>
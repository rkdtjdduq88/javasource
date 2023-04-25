<%@page import="user.domain.UserDTO"%>
<%@page import="java.util.List"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	UserDAO dao = new UserDAO();
	List<UserDTO> list = dao.getList();
	
	//list 를 list.jsp 에서 보여주고 싶음
	request.setAttribute("list", list); // "list"란 이름으로 저장해놨으니까 list를 불러오면 돼
	pageContext.forward("list.jsp"); // 야 결과는 나랑 request가 같은 list.jsp가 보여줄거야
%>
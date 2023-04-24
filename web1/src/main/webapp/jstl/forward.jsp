<%@page import="user.domain.LoginDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


	List<LoginDTO> loginDTO = new ArrayList<>();

	loginDTO.add(new LoginDTO("hong123","12345"));
	loginDTO.add(new LoginDTO("hong124","12345"));
	loginDTO.add(new LoginDTO("hong125","12345"));
	loginDTO.add(new LoginDTO("hong126","12345"));
	loginDTO.add(new LoginDTO("hong127","12345"));
	loginDTO.add(new LoginDTO("hong128","12345"));
	
	request.setAttribute("loginDTO", loginDTO);
	pageContext.forward("jstlTest.jsp");

%>
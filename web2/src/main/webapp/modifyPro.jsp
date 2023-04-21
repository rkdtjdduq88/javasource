<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// form 내용 가져오기
	request.setCharacterEncoding("utf-8");
	int no = Integer.parseInt(request.getParameter("no"));
	String addr = request.getParameter("newaddr");
	String mobile = request.getParameter("newmobile");
	
	// update usertbl set addr=?, mobile=? where no=?
	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";
	Connection con = DriverManager.getConnection(url, user, password);
/* 	String sql = "update usertbl set addr=?, mobile=? where no=?";	
	PreparedStatement pstmt = con.prepareStatement(sql);	
	
	pstmt.setString(1,addr);
	pstmt.setString(2,mobile);
	pstmt.setInt(3,no);
	
	int count = pstmt.executeUpdate();
	
	// update usertbl set addr=? where no=?
	String sql2 = "update usertbl set addr=? where no=?";
	PreparedStatement pstmt2 = con.prepareStatement(sql2);
	pstmt2.setString(1,addr);
	pstmt2.setInt(2,no);
	
	int count2 = pstmt2.executeUpdate();	
	// update usertbl set mobile=? where no=?
	String sql3 = "update usertbl set mobile=? where no=?";
	PreparedStatement pstmt3 = con.prepareStatement(sql3);
	pstmt3.setString(1,mobile);
	pstmt3.setInt(2,no);
	
	int count3 = pstmt3.executeUpdate();
	
	String path = "";
	if(count > 0 || count2 > 0 || count3 > 0){
	// update 성공 시 페이지 이동 get.jsp?no=
		path = "get.jsp?no="+no;
	}
	response.sendRedirect(path); */
	
	PreparedStatement pstmt = null;
	String sql = "";
	if(addr!="" && mobile!=""){
		sql = "update usertbl set addr=?, mobile=? where no=?";
		pstmt = con.prepareStatement(sql);			
		pstmt.setString(1,addr);
		pstmt.setString(2,mobile);
		pstmt.setInt(3,no);
	}else{
		if(addr!=""){
			sql = "update usertbl set addr=? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,addr);
			pstmt.setInt(2,no);
		}else{
			sql = "update usertbl set mobile=? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,mobile);
			pstmt.setInt(2,no);
		}
	}
	
	int count = pstmt.executeUpdate();
	
	String path = "";
	if(count > 0){
	// update 성공 시 페이지 이동 get.jsp?no=
		path = "get.jsp?no="+no;
	}else{
		path = "modify.jsp?no="+no;
	}	
	response.sendRedirect(path);
%>
package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionFactory;
import action.ActionForward;
import action.DeleteAction;
import action.InsertAction;

@WebServlet("*.do") // Url mapping : 이름은 상관없으나 끝날때는 .do 로 끝나야 함
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI(); // /pattern/list.do
		// 프로젝트 == context
		String contextPath = request.getContextPath(); // /pattern
		String cmd = requestURI.substring(contextPath.length());  // substring으로 프로젝트명 이후부분만 호출 => /list.do
		
		System.out.println("requestURI "+ requestURI);
		System.out.println("contextPath "+ contextPath);
		System.out.println("cmd "+ cmd);
		
		ActionFactory actionFactory = ActionFactory.getInstance();		
		Action action = actionFactory.action(cmd);		
		
		// 생성된 액션에 일 시키기(메소드호출)
		ActionForward af =null;
		try {
			af = action.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//
		if(af.isRedirect()) {
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}

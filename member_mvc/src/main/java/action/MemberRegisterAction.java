package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get or post
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		// service
		MemberRegisterService service = new MemberRegisterService();
		boolean registerFlag = service.getRegister(userid, password, name, gender, email);
		
		String path="";
		if(registerFlag) {
			path = "index.jsp";
		}else {
			path = "register.jsp";
		}
		
		// ActionForward
		return new ActionForward(true, path);
	}

}

package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLoginService;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get or post
		MemberDTO dto = new MemberDTO();
//		dto.setUserid(request.getParameter("userid"));
//		dto.setPassword(request.getParameter("password"));
//		dto.setName(request.getParameter("name"));
//		dto.setGender(request.getParameter("gender"));
//		dto.setEmail(request.getParameter("email"));
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		// service
		MemberRegisterService service = new MemberRegisterService();
		boolean insertFlag = service.memberInsert(userid, password, name, gender, email);
		
		String path="";
		boolean lg = true;
		if(insertFlag) {
			MemberLoginService lgservice = new MemberLoginService();
			MemberDTO dname = lgservice.login(userid, password);
			HttpSession session = request.getSession();
			session.setAttribute("dname", dname);
			lg = false;
			path = "login.jsp";
		}else {
			path = "register.jsp";
		}
		
		// ActionForward
		return new ActionForward(lg, path);
	}
	
}

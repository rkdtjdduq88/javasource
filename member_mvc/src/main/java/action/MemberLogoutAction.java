package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get/post => X
		// service 필요없음(DB작업 없음)
		
		// session 해제
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto"); // or session.invalidate(); (전부 다 날림)
		// ActionForward : index.jsp
		return new ActionForward(true, "index.jsp");
	}
	
}

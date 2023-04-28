package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLeaveService;

public class MemberLeaveAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		MemberDTO dto = new MemberDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));
		
		// service
		MemberLeaveService service = new MemberLeaveService();
		boolean leaveFlag = service.leave(dto);
		// ActionForward
		String path = "";
		if(leaveFlag) {
			// 탈퇴 성공시 세션 해제 index.jsp
			HttpSession session = request.getSession();
			session.invalidate();
			path = "index.jsp";
		}else {
			path = "leave.jsp";
		}
		return new ActionForward(true, path);
	}

}

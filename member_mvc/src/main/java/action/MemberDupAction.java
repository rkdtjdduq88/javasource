package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberDupService;

public class MemberDupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		String userid = request.getParameter("userid");
		
		MemberDupService service = new MemberDupService();
		boolean dupFlag = service.dupId(userid);
		
		// true 면 아이디 사용가능
		if(dupFlag) {
			request.setAttribute("dupId", "true"); // 결과페이지만 써줌
		}else {
			request.setAttribute("dupId", "false");
		}
		
		return new ActionForward(false, "checkId.jsp");
	}

}

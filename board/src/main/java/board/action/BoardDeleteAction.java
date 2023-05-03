package board.action;

import javax.servlet.http.HttpServletRequest;

import board.service.BoardDeleteService;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("password");
		
		BoardDeleteService service = new BoardDeleteService();
		boolean deleteFlag = service.delete(bno,password);
		
		String path = "";
		if(deleteFlag) {
			path = "list.do";
		}else {
			path = "modify.do?bno="+bno;
		}
		return new ActionForward(true, path);
	}

}

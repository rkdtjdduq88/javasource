package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.PageDTO;
import board.service.BoardDeleteService;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("password");
		
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		
		
		BoardDeleteService service = new BoardDeleteService();
		boolean deleteFlag = service.delete(bno,password);
		
		String path = "";
		if(deleteFlag) {
			path = "list.do?criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}else {
			path = "modify.do?bno="+bno+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}
		return new ActionForward(true, path);
	}

}

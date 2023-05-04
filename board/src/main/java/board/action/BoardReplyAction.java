package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReplyService;
import board.util.BoardUploadUtils;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formData = utils.uploadFile(request);
		
		BoardDTO dto = new BoardDTO();
		dto.setName(formData.get("name"));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}
		
		// 원본글 정보
		int bno = Integer.parseInt(formData.get("bno"));
		dto.setReRef(Integer.parseInt(formData.get("re_ref")));
		dto.setReLev(Integer.parseInt(formData.get("re_lev")));
		dto.setReSeq(Integer.parseInt(formData.get("re_seq")));
		
		BoardReplyService service = new BoardReplyService();
		boolean replyFlag = service.replyInsert(dto);
		
		String path = "";
		if(replyFlag) {
			path = "list.do";
		}else {
			path = "replyView.do?bno="+bno;
		}
		return new ActionForward(true, path);
	}

}

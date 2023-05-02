package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardwriteService;
import board.util.BoardUploadUtils;

public class BoardWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		
		// multipart/form-data 형태 ==> request.getParameter() 작업 불가
		// request ==> BoardUploadUtils 넘겨야 함
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formData = utils.uploadFile(request);
		
		// formData 값들을 BoardDTO 객체 생성 후 담기
		// file 이 입력된 경우와 입력이 안된 경우
		BoardDTO dto = new BoardDTO();
		dto.setName(formData.get("name"));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}
				
		// 서비스 작업
		BoardwriteService service = new BoardwriteService();
		boolean insertFlag = service.insert(dto);
		
		// ActionForward : 성공하면 목록 보여주기, 실패시 writeForm.jsp 
		String path = "";
		if(insertFlag) {
			path = "list.do";
		}else {
			path = "writeForm.jsp";
		}
		
		return new ActionForward(true, path);
	}

}

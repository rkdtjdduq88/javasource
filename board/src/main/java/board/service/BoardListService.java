package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardListService {
	public List<BoardDTO> getlist(){
//		BoardDAO dao = new BoardDAO();
//		return dao.getRows();
		return new BoardDAO().getRows();
	}
}
